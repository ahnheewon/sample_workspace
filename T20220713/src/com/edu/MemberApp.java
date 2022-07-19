package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {

	Scanner scn = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급

		while (true) {
			System.out.println("\n1.등록   2.수정   3.전체리스트   9.종료 ");
			System.out.print("\n번호 선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			int memberId; 
			String memberName, phone, Tname, score;
			
			
			if (selectNo == 1) {
				
				System.out.print("반을 선택하세요 ");
				System.out.print("1) 도서반 2) 축구반 3)수영반 ");
				
				System.out.print("회원 아이디 입력> ");
				System.out.print("회원 이름 입력> ");
				System.out.print("회원 연락처 입력> ");
				
				//int memberId, String memberName, String phone, String Tname, String score
				//인터페이스 불러오는 법을 모르겠음..
//				if (selectNo == 1) {
//				addMember(new BookMember(memberId, memberName, phone,Tname,score));}
//				
//				else if  (selectNo == 2) {
//					addMember(new SoccerMember(memberId, memberName, phone,Tname,score));}
//					
//				else if (selectNo == 3) {
//					addMember(new SwimMember(memberId, memberName, phone,Tname,score));}
//					
//				
				
			} else if (selectNo == 2) {

				System.out.print("연락처를 수정할 회원 아이디 입력> ");
				memberId = Integer.parseInt(scn.nextLine());
				
				
			//	Member member = new member(memberId,null,phone);
			//	modifyMember(new Member(memberId,null,phone));
			}

			// 수정할 정보는 회원의 아이디를 기준으로 연락처만 수정.
			else if (selectNo == 3) {
				System.out.println();
				memberList();
			}

			else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	@Override // 멤버추가
	public void addMember(Member member) {
		members.add(member);
	}

	@Override // 멤버 수정
	public void modifyMember(Member member) {
		for (int i = 0; i < members.size(); i++) {
			if (member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
			}

		}

	}

	@Override
	public List<Member> memberList() {

		return members;

	}
}
