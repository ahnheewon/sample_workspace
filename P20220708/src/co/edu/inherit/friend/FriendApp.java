package co.edu.inherit.friend;

import java.util.Scanner;

/*
 * 
 *  등록, 조회, 목록
 * 
 */

public class FriendApp {
	// 생성자 기본생성자 사용.

	Friend[] friends = new Friend[10];
	int friendNum;

	Scanner scn = new Scanner(System.in);

	public void start() {

		while (true) {
			System.out.println("1. 등록 | 2. 조회 | 3.목록 | 9.종료");
			timerShow("선택> ");
			int selectNo = 0;
			
			
			try {
				selectNo = Integer.parseInt(scn.nextLine()); // "가" -> 12 라고 치면?
			} catch (Exception e) {
				System.out.println("error : 숫자를 입력하세요\n");
			}

			
			
			if (selectNo == 1) {
				add();
			} else if (selectNo == 2) {
				search();
			} else if (selectNo == 3) {
				list();
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램을 종료.");
	} // end of start()

	private void add() { // 1번 누르면 호출

		System.out.println("이름> ");
		String name = scn.nextLine();
		System.out.println("연락처> ");
		String phone = scn.nextLine();

		while (true) {
		System.out.println("어떤 관계입니까?");
		System.out.println("1.학교 2.회사 3.친구");   ///이부분 try-catch로 수정해야함!!!
		System.out.println("선택> ");

		int choice = Integer.parseInt(scn.nextLine());

		

			if (choice == 1) {
				System.out.println("학교이름>");
				String univ = scn.nextLine();
				System.out.println("전공>");
				String major = scn.nextLine();

				friends[friendNum++] = new UnivFriend(name, phone, univ, major);
				break;

			} else if (choice == 2) {
				System.out.println("회사이름>");
				String company = scn.nextLine();
				System.out.println("부서>");
				String dptmt = scn.nextLine();

				friends[friendNum++] = new ComFriend(name, phone, company, dptmt);
				break;
			} else if (choice == 3) {
				friends[friendNum++] = new Friend(name, phone);
				break;
			} else
				System.out.println("잘못 입력하셨습니다.");

		}

	}

	private void search() {
		System.out.println("친구이름을 입력하세요");
		int c = 0;
		String fname = scn.nextLine(); // 검색한 이름을 배열에서 찾아야 한다.
		for (int i = 0; i < friendNum; i++) { // 배열에서 어떻게 이름만 가져오지??
			if (friends[i].getName().equals(fname)) { // -> friends[i].getName()
				friends[i].showInfo();
			} else
				c++;
		}
		if (c == friendNum)
			System.out.println("찾을 수 없습니다.");
	}

	private void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());

		}
	}
	
	private void timerShow(String msg) {
		
		String[] message= msg.split("");
		for(int i = 0; i < message.length; i++) {
			System.out.println(message[i]);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}