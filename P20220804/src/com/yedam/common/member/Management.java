package com.yedam.common.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class Management extends DAO {

	public Management() {
		// 전체 조회
		showInfo();

		// 한 건 조회
		getMember();

		// 한 건 입력
		// insertInfo();

		// 수정
		// updateInfo();
		
		// 삭제
		//deleteInfo();
	}
	private void deleteInfo() {

	int result = 0;
	try {
		// 1. DB연결
		conn();
		// 2. query문 작성
		String sql = "delete from member where id=? ";
		// 3. 통로 생성
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "A"); // 1번째 물음표	
		// DML (insert, update, delete) -> executeUpdate()
		// Select -> executeQuery()
		// Insert,Update,Delete -> executeUpdate()
		result = pstmt.executeUpdate();
		// 자동 커밋됩니다!
	} catch (Exception e) {

	} finally {
		disconnect();
	}
	if (result == 1) {
		System.out.println(result+"건이 삭제 되었습니다.");
	} else {
		System.out.println("삭제되지 않았습니다.");
	}
	}
	
	private void updateInfo() {
		int result = 0;
		try {
			// 1. DB연결
			conn();
			// 2. query문 작성
			String sql = "update member set pw=? where id=?";
			// 3. 통로 생성
			pstmt = conn.prepareStatement(sql);
			// 4. 데이터 입력
			pstmt.setString(1, "4321"); // 1번째 물음표
			pstmt.setString(2, "A"); // 2번째 물음표

			// DML (insert, update, delete) -> executeUpdate()
			// Select -> executeQuery()
			// Insert, update -> executeUpdate()
			result = pstmt.executeUpdate();
			// 자동 커밋됩니다!
		} catch (Exception e) {

		} finally {
			disconnect();
		}
		if (result == 1) {
			System.out.println(result + "건이 수정되었습니다.");
		} else
			System.out.println("수정되지 않았습니다.");

	}

	private void insertInfo() {

		int result = 0;
		try {
			// 1. DB연결
			conn();
			// 2. query문 작성
			String sql = "insert into member values(?,?,?)";
			// 3. 통로 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "E"); // 1번째 물음표
			pstmt.setString(2, "2222"); // 2번째 물음표
			pstmt.setString(3, "박씨"); // 3번째 물음표

			// DML (insert, update, delete) -> executeUpdate()
			// Select -> executeQuery()
			// Insert -> executeUpdate()
			result = pstmt.executeUpdate();
			// 자동 커밋됩니다!
		} catch (Exception e) {

		} finally {
			disconnect();
		}
		if (result == 1) {
			System.out.println("정상 입력되었습니다.");
		} else {
			System.out.println("실패");
		}
	}

	private void getMember() {
		Member member = null;
		try {

			// 1. DB연결
			conn();
			// 2. query문 작성
			String sql = "select * from member where id=?";
			// 3. 실행
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "C"); // 1번째 ? 부분에 "A" 값
			// (prepareStatement 는 통로 만들고 바로 전송함)
			rs = pstmt.executeQuery();

			// 한 건 뿐이므로 if 문
			if (rs.next()) {
				member = new Member(); // 초기화
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
			}
			System.out.println("*********************************");
			System.out.println(member.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 전체조회
	private void showInfo() {
		List<Member> list = new ArrayList<>();

		Member mem = null;

		try {

			conn(); // conn() 메소드로 DB연결
			String sql = "select * from member"; // query 작성

			// 연결된 DB에 query문 보낼 수 있는 통로 생성.
			stmt = conn.createStatement();
			// 만들어진 통로를 통해 query문 보내기.
			// ResultSet(rs) select 조회할 때만 사용
			rs = stmt.executeQuery(sql);
			while (rs.next()) { // 존재하는지 안하는지 여부 알려주는 메소드
								// , 없으면 false가 된다.
				mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setName(rs.getString("name"));
				mem.setPw(rs.getString("pw"));
				list.add(mem);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		for (Member member : list) {
			System.out.println(member.toString());
		} // DB에서 생성하고 commit 필수!
	}
}
