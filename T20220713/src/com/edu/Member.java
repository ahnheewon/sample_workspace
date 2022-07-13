package com.edu;

public class Member {
	// 회원아이디, 회원명, 연락처 정보.

	private int memberId;
	private String memberName;
	private String phone;

	// 생성자.
	public Member() {

	}

	public Member(int memberId, String memberName, String phone) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
	}

	// getter, setter
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "회원 [회원ID :" + memberId + ", 회원명 :" + memberName + ", 연락처" + phone + "]";
	}

	public void addMember(Member member) {
		// TODO Auto-generated method stub
		
	}

	


}
