package com.yedam.member;

public class MemberService {

	public MemberDTO doLogin(MemberDTO member) {
		MemberDTO mem = MemberManage.getiInstance().login(member);
		if (mem == null) {
			System.out.println("로그인 실패\n");
			return null;
		} else {
			System.out.println("로그인 성공\n");
			return mem;
		}
	}
}
