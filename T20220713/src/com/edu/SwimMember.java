package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwimMember extends Member { //Member의 속성 그대로 물려받음.
	String Tname;
	String score;
	Scanner scn = new Scanner(System.in);
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)

	// 정보출력시 => 강사이름: 홍길동, 등급: A

	public SwimMember(int memberId, String memberName, String phone, String Tname, String score) {
		super(memberId, memberName, phone); // 부모 것은 super로 생성자표현.
		this.Tname = Tname;
		this.score = score; // 내 것은 this.
	}

	@Override
	public void addMember(Member member) {
		System.out.print("회원아이디> ");
		int memberId = Integer.parseInt(scn.nextLine());
		System.out.print("회원명> ");
		String memberName = scn.nextLine();
		System.out.print("연락처> ");
		String phone = scn.nextLine();

		List<Member> members = new ArrayList<Member>();
		Member mem = new Member(memberId, memberName, phone);
		members.add(mem);

	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override //자식클래스에서 재정의
	public String toString() {

		return "회원 [회원ID :" + getMemberId() + ", 회원명 :" + getMemberName() + ", 연락처 :" + getPhone() + " 강사이름:" + Tname
				+ ", 등급 : " + score + "]";
	}

}
