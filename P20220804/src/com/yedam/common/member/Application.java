package com.yedam.common.member;

import java.util.List;
import java.util.Scanner;

public class Application {

	Scanner sc = new Scanner(System.in);

	public Application() { // 실행만 하는 곳
		run();

//List<Member> list = MemberManagement.getInstance().getMemberList();
		// MemberManagement mm = new MemberManagement(); 의미
//for(Member member : list) {
//System.out.println(member.toString());

	}

	private void run() {
		boolean run = true;
		while (run) {
			System.out.println(
					"\n|  1. 전체 조회  |  2. 단일 조회  |  3. 회원 입력  |" + " \n | 4. PW 수정  |  5. 회원 삭제  |  6. 전원 종료  |");
			System.out.println("\n입력>");

			int menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {

			case 1:
				List<Member> list = MemberManagement.getInstance().getMemberList();
				if (list.size() == 0) {
					System.out.println("데이터가 한 건도 없습니다.");
				} else {
					for (Member member : list) {
						System.out.println(member.toString());
					}
				}
				break;

			case 2:
				System.out.println("조회할 ID 입력> ");
				String id = sc.nextLine();
				Member member = MemberManagement.getInstance().getMember(id);
				if (member == null) {
					System.out.println("등록되지 않은 ID");
				} else
					System.out.println(member.toString());
				break;

			case 3:
				Member member2 = new Member();
				System.out.println("=============회원 등록=============");
///중복된 닉네임입니다 넣고 싶은데....
				System.out.println("ID> ");
				String str1 = sc.nextLine();
				member2.setId(str1);

				System.out.println("PW> ");
				String str2 = sc.nextLine();
				member2.setPw(str2);
				;
				System.out.println("이름을 입력> ");
				String str3 = sc.nextLine();
				member2.setName(str3);

				int result = MemberManagement.getInstance().insertMember(member2);
				if (result == 1) {
					System.out.println("정상 입력");
				} else
					System.out.println("입력 실패");

				break;

			case 4:
				Member member3 = new Member();
				System.out.println("=============PW 수정=============");
				System.out.println("수정할 ID 입력> ");
				String str4 = sc.nextLine();
				member3.setId(str4);

				System.out.println("입력하신 ID의 수정할 PW 입력>");
				String str5 = sc.nextLine();
				member3.setPw(str5);

				int result2 = MemberManagement.getInstance().updateMember(member3);

				if (result2 == 1) {
					System.out.println("정상 수정");
				} else {
					System.out.println("수정 실패");
				}

				break;

			case 5:
				System.out.println("=============회원 삭제=============");
				System.out.println("삭제할 ID 입력> ");
				String str6 = sc.nextLine();
				int result3 = MemberManagement.getInstance().deleteMember(str6);
				if (result3 == 1) {
					System.out.println("정상 삭제");
				} else {
					System.out.println("삭제 실패");
				}

				break;

			case 6:
				System.out.println("=============프로그램 종료=============");
				run = false;
				break;
			default:
				break;

			}

		}
	}
}
