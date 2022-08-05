package com.bank.loan;

import java.sql.Date;

public class Loan {

	/*	LOAN_ID	VARCHAR2(20 BYTE)
		MEMBER_ID	VARCHAR2(20 BYTE)
		LOAN_DATE	DATE
		STATE	CHAR(1 BYTE)	*/
	
	private String loanId;
	private String memberId;
	private Date loanDate;
	private String state;
	
	
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
