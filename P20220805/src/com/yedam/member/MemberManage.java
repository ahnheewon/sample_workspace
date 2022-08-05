package com.yedam.member;

import com.yedam.common.DAO;

//member 관련 sql(DB)을 다 작성
public class MemberManage extends DAO {
	// 싱글톤 생성

	private static MemberManage mm = null; // 그냥 mm; 하면 값이 할당이 안돼서 데이터 비교가 안된다.

	// 생성자 생성 막기
	private MemberManage() {

	}

	public static MemberManage getiInstance() {
		if (mm == null) {
			mm = new MemberManage();
		}
		return mm;

	}

	public MemberDTO login(MemberDTO member) {

		MemberDTO mem = null;
		try {
			conn();
			String sql = "select * from member where member_id = ? and member_pw =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());

			rs = pstmt.executeQuery();
			if (rs.next()) {
				mem = new MemberDTO();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberBelong(rs.getString("member_belong"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return mem;
	}

}
