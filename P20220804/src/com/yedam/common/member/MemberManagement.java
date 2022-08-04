package com.yedam.common.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberManagement extends DAO {
//싱글톤 생성

	private static MemberManagement mm = null;

	// private생성자
	private MemberManagement() {

	}

	// 단 하나의 객체를 사용할 수 있도록 메소드 생성
	public static MemberManagement getInstance() {
		if (mm == null) {
			return new MemberManagement(); // 없으면 새 객체 생성
		} else
			return mm; // 객체가 이미 만들어져 있으면 mm사용.
	}

	// 1. 전체 조회
	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		Member member = null;

		try {

			conn();

			String sql = "SELECT * FROM member";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				member = new Member(); // 초기화-> 멤버란 객체를 새로 만들기 위해
				// ↑ 굳이 여기서 초기화 하는 이유는 new 연산자로 반복하면서 각 사람당 계속 넣어줌.
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
				list.add(member);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 2. 단일 조회
	public Member getMember(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from member where id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // 매개변수 일치 시킨다
			rs = pstmt.executeQuery();
			if (rs.next()) { // while은 전체, if는 단일
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;
	}

	// 3. 입력
	public int insertMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?)";
			// String sql= "insert into member (id,pw) values (?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 4. 수정
	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw =? where id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getId());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	// 5. 삭제

	public int deleteMember(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
}
