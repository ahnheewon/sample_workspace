package com.bank.member;

import com.bank.common.DAO;

public class MemberManage extends DAO {

	// 싱글톤
	private static MemberManage mm = new MemberManage();

	// static 일치 시켜준다.
	private MemberManage() {

	}

	public static MemberManage getInstance() {
		return mm; // static 일치 시켜준다.
	}

	// 로그인 메소드
	public Member loginInfo(String id) {
		Member member = null;
		try {
			conn();
			// id -> PK
			// 1개의 row만 반환됨.
			String sql = "select * from bankmember where member_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				//MemberManager -> 로그인 메소드
				//setAccountId -> setMemberId
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getNString("member_pw"));
				member.setMemberName(rs.getNString("member_name"));
				member.setRole(rs.getString("role"));
				// 반환값을 객체에 넣음.
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;
	}

	// 고객 등록 메소드
	public int registCustomer(Member member) {
		int result = 0;
		try {
			conn();

			String sql = "insert into bankmember (member_id, member_pw," 
							+ "member_name,role) values (?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getRole());

			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	
	}

}
