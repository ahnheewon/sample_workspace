package com.bank.member;

import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);

	public static Member memberInfo = null;

	// 로그인
	public void doLogin() {

		Member member = new Member();

		System.out.println("ID> ");
		String id = sc.nextLine();
		System.out.println("PW> ");
		String pw = sc.nextLine();

		// loginInfo에서 받은 정보를 싱글톤으로 호출.
		// 로그인 정보가 member에 들어감.
		member = MemberManage.getInstance().loginInfo(id);

		// DB에서 조회한 정보와 내가 입력한 PW를 비교
		if (member.getMemberPw().equals(pw)) { // DBpw 자바pw가 같으면
			memberInfo = member; // 전 역에서 사용할 수 있는 memberInfo 만들어짐.
			System.out.println("로그인 성공\n");
		} else {
			System.out.println("로그인 실패\n");
			// memberInfo = null; 인 상태.
		}

	}

	// 로그아웃
	public void doLogout() {

		if (memberInfo != null)
			memberInfo = null;

	}

	// 고객등록
	public void registCustomer() {
		Member member = new Member();

		System.out.println("고객 ID> ");
		String id = sc.nextLine();
		System.out.println("고객 PW> ");
		String pw = sc.nextLine();
		System.out.println("고객 이름> ");
		String name = sc.nextLine();

		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");

		int result = MemberManage.getInstance().registCustomer(member);
		if(result == 1) {
			System.out.println("고객 정보 등록 성공");
		} else if(result ==0) {
			System.out.println("고객 정보 등록 실패");
		}
	
	}

}
