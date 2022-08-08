package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.loan.LoanService;
import com.bank.member.MemberService;

public class Management {
	Scanner sc = new Scanner(System.in);

	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService(); // 서비스에 있는 로직 사용가능.

	int menuNo = 0;

	public Management() {
		bankJob();
	}

	private void bankJob() {

		while (true) {
			menuInfo();
			if (MemberService.memberInfo.getRole().equals("1")) {
				if (menuNo == 1) {
					ms.registCustomer();
				} else if (menuNo == 2) {
					// 계좌 개설
					as.makeAccount();

				} else if (menuNo == 3) {
					// 입출금
					as.money();
				} else if (menuNo == 4) {
					// 계좌이체 update문이 총 두 번
					as.transfer();
				} else if (menuNo == 5) {
					as.deleteAccount();
				} else if (menuNo == 6) {
					System.out.println("  1. 대출 신청  |  2. 대출 변경  ");
					int menu = Integer.parseInt(sc.nextLine());

					if (menu == 1) {
						// 대출 승인
						ls.insertLoan();
					} else if (menu == 2) {
						ls.updateLoan();
					}
				} else if (menuNo == 7) {

					ms.doLogout();
					System.out.println(" 로그아웃 되었습니다. ");
					break;

				}

			}
			// 일반 고객
			else if (MemberService.memberInfo.getRole().equals("0")) {
				if (menuNo == 1) {
					as.getAccount();
				} else if (menuNo == 2) {
					as.money();
				} else if (menuNo == 3) {
					as.transfer();
				} else if (menuNo == 4) {
//					1)상환 -> update
//					2)대출 조회 -> select
					System.out.println("  1. 상환  |  2. 대출 조회  ");
					int menu = Integer.parseInt(sc.nextLine());
					// 상환
					if (menu == 1) {
						ls.updateMoney();
					}
					// 대출 조회
					else if (menu == 2) {
						ls.loanInfo();
					}

				} else if (menuNo == 5) {
					ms.doLogout();
					System.out.println(" 로그아웃 되었습니다. ");
					break;
				}
			}
		}

	}

	private void menuInfo() {
		// role ==1, 은행원(관리자)
		if (MemberService.memberInfo.getRole().equals("1")) { // 은행원 전용
			System.out.println("1. 고객 등록 | 2. 계좌 개설 | 3. 입·출금 | 4. 계좌 이체 " + "| 5. 계좌 해지 | 6. 대출 " + "| 7. 로그아웃");

		}
		// role ==0, 일반 사용자
		else if (MemberService.memberInfo.getRole().equals("0")) { // 고객 전용
			System.out.println("1.계좌 조회 | 2. 입·출금 | 3. 계좌 이체 | 4. 대출  | 5. 로그아웃");

		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(sc.nextLine());

	}
}
