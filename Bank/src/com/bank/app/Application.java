package com.bank.app;

import java.util.Scanner;

import com.bank.member.MemberService;

public class Application {
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();

	int menuNo = 0;

	public Application() {
		run();
	}

	private void run() {
		boolean run = true;
		while (run) {

			System.out.println("1. 로그인 | 2. 종료 ");
			menuNo = Integer.parseInt(sc.nextLine());
			switch (menuNo) {
			case 1:
				// 로그인 하는 기능
				ms.doLogin();
				System.out.println(MemberService.memberInfo.getMemberName() + "님 어서오세요.");
				if (MemberService.memberInfo != null) {
					new Management();
				}
				break;
			case 2:
				run = false;
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			}
		}
	}

}
