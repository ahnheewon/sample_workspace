package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMember extends Member {

	String room;
	String Mname;

	// 상속 이외의 정보 추가해야함. 필드로;
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	// 정보출력시 => to string 기본정보 및 반장이름: 홍길동, 강의실: 모험실

//	public DmbCellPhone(String model, String color, int channl) {
//		// this.model = model; // this는 자기 자신을 의미하는데 model 속성은 원래 부모 것이다.
//		// 부모 클래스에서 model 속성이 private 이므로 마음대로 사용불가.
//		super(model, color);// 부모 것은 super 로
//		this.channel = channel; // 자기 것은 this로 표현해야 한다.

	public BookMember(int memberId, String memberName, String phone, String room, String Mname) {
		
		super(memberId, memberName, phone);
		this.room = room;
		this.Mname = Mname;
	}
	Scanner scn = new Scanner(System.in);

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

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	@Override
	public String toString() {

		return "회원 [회원ID :" + getMemberId() + ", 회원명 :" + getMemberName() + ", 연락처 :" + getPhone() + " 반장이름:"+ Mname+", 강의실: "+room+"]";
	}
	
}
