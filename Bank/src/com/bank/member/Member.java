package com.bank.member;

public class Member {

	/*MEMBER_ID	VARCHAR2(20 BYTE)
	COLUMN1	VARCHAR2(20 BYTE)
	COLUMN2	VARCHAR2(20 BYTE)
	ACCOUNT_ID	VARCHAR2(20 BYTE)
	ROLE	CHAR(1 BYTE)*/
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private String accountId;
	private String role; // 권한, 1이면 은행원, 0이면 사용자
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
