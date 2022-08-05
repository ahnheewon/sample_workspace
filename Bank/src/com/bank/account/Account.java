package com.bank.account;

import java.sql.Date;

public class Account {
	/*	ACCOUNT_ID	VARCHAR2(20 BYTE)
		MEMBER_ID	VARCHAR2(20 BYTE)
		BALANCE	NUMBER
		CREDATE	DATE	*/
	
	private String accountId;
	private String memberId;
	private int balance;
	private Date credate; 
	//date 타입 java, sql 차이 -> 자바(년/월/일/시/분/초), sql(년/월/일)
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Date getCredate() {
		return credate;
	}
	public void setCredate(Date credate) {
		this.credate = credate;
	}
	
	
	
}
