package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoccerMember extends Member {
	
	String Lroom;
	String Cname;
	Scanner scn = new Scanner(System.in);
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: 희망실 
	
	//get set 메소드 tostring 
	
	
	
	public SoccerMember(int memberId, String memberName, String phone, String Lroom, String Cname) {
		super(memberId, memberName, phone);
		this.Lroom = Lroom;
		this.Cname = Cname;
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
	
	
	public String getLroom() {
		return Lroom;
	}

	public void setLroom(String lroom) {
		Lroom = lroom;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	@Override
	public String toString() {

		return "회원 [회원ID :" + getMemberId() + ", 회원명 :" + getMemberName() + ", 연락처 :" + getPhone() + " 코치이름:"+ Cname+", 락커룸: "+Lroom+"]";
	}
	
	
}
