package com.bank.loan;

import java.util.ArrayList;
import java.util.List;

import com.bank.common.DAO;

public class LoanManage extends DAO {

	private static LoanManage loanManage = null;

	private LoanManage() {

	}

	public static LoanManage getInstance() {
		if (loanManage == null) {
			loanManage = new LoanManage();
		}
		return loanManage;
	}

	// 은행원
//	1) 대출 승인 INSERT
	public int insertLoan(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "insert into loan values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getLoanId());
			pstmt.setString(2, loan.getMemberId());
			pstmt.setString(3, loan.getLoanDate());
			pstmt.setString(4, loan.getState());
			pstmt.setInt(5, loan.getLoanMoney());

			result = pstmt.executeUpdate(); // 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
//	2) 대출 정보 변경(Y/N) UPDATE

	public int updateLoan(Loan loan) {
		int result = 0;
		try {
			conn();

			String sql = "update loan set state =? where loan_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getState());
			pstmt.setString(2, loan.getLoanId());

			
			result = pstmt.executeUpdate(); // 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	// 일반 고객
//	1) 상환 UPDATE
	public int updateMoney(Loan loan) {
		int result = 0;
		try {
			conn();

			String sql = "update loan set loan_money =loan_money-? where loan_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loan.getLoanMoney());
			pstmt.setString(2, loan.getLoanId());
			
			String sql1 = "update loan set balance-loan_money where loan_id=?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, loan.getLoanId());


			result = pstmt.executeUpdate(); // 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}
//	2) 대출 조회 SELECT
// loan table column loan_money

	public List<Loan> getLoanInfo(String memberId) {
		List<Loan> list = new ArrayList<>();
		Loan loan = null;

		try {
			conn();

			String sql = "SELECT b.MEMBER_NAME, l.loan_id, l.loan_money, l.loan_date from bankmember b join loan l on b.member_id = l.member_id where b.member_id=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);

			rs = pstmt.executeQuery();

			while (rs.next()) { // 전체 출력
				// member_name
				// loan_id
				// loan_money
				// loan_data
				loan = new Loan();
				loan.setMemberName(rs.getString("member_name"));
				loan.setLoanId(rs.getString("loan_id"));
				loan.setLoanMoney(rs.getInt("loan_money"));
				loan.setLoanDate(rs.getString("loan_date"));
				list.add(loan);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

// 고객 이름, 대출 id, 대출 금액, 대출 날짜
// join 필요
}
