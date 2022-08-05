package com.bank.account;

import com.bank.common.DAO;

public class AccountManage extends DAO {

	private static AccountManage am = new AccountManage();

	private AccountManage() {

	}

	public static AccountManage getInstance() {
		return am;
	}

	// 계좌 개설
	public int insertAccount(Account account) {
		int result = 0;

		try {
			conn();

			String sql = "INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID) VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getAccountId());
			pstmt.setString(2, account.getMemberId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 입출금
	public int updateMoney(Account account, int cmd) {
		int result = 0;
		try {
			conn();
			// 입출금 -> update
			// 계산한 데이터를 바로 넣어주면 됨.
			// 다른 연산 필요없이 가능.

			// 현재 잔고를 가져옴
			String sql1 = "select balance from account where account_id =?";

			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, account.getAccountId());
			rs = pstmt.executeQuery();

			int balance = 0;
			if (rs.next()) {
				// rs.getInt(balance);
				balance = rs.getInt("balance");
			}

			// 잔고를 계산
			// 입금=1, 출금=2
			if (cmd == 1) {
				// balance => 현재잔고
				// account.getBalancer() => 입금하고자하는 금액
				// balance + account.getBalance() => 입금한 금액
				account.setBalance(balance + account.getBalance());

				String sql0 = "UPDATE ACCOUNT SET balance =? where account_id =?";
				pstmt = conn.prepareStatement(sql0);
				pstmt.setInt(1, account.getBalance());
				pstmt.setString(2, account.getAccountId());
				result = pstmt.executeUpdate();

			} else if (cmd == 2) {
				// 잔고 > 출금액
				if (balance - account.getBalance() >= 0) {
					account.setBalance(balance - account.getBalance());

					String sql2 = "UPDATE ACCOUNT SET balance =? where account_id =?";
					pstmt = conn.prepareStatement(sql2);
					pstmt.setInt(1, account.getBalance());
					pstmt.setString(2, account.getAccountId());
					result = pstmt.executeUpdate();

				}
				// 잔고 < 출금액
				else {
					System.out.println("잔액이 부족합니다.");
				}

			}

			String sql3 = "UPDATE ACCOUNT SET balance =? where account_id =?";
			pstmt = conn.prepareStatement(sql3);
			pstmt.setString(1, "");
			pstmt.setString(2, "");

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 3. 계좌 해지
	public int delAccount(String accountId) {
		int result = 0;

		try {
			conn();

			String sql = "DELETE FROM ACCOUNT WHERE ACCOUNT_ID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountId);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 4. 계좌 이체
	public void transferMoney(String toAccount, String fromAccount, int balance) {
		// void를 사용해서 그냥 이 메소드에서 전부 처리.
		// toAccount => 받는 사람
		// fromAccount => 보내는 사람
		// balance => 금액

		int result = 0;
		try {
			conn();

			// 보내는 사람의 계좌에 돈을 빼주는 쿼리
			String sql0 = "update account set balance=balance-? where account_id =?";
			pstmt = conn.prepareStatement(sql0);
			pstmt.setInt(1, balance);
			pstmt.setString(2, fromAccount);

			result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("정상 출금되었습니다.");
				// 받는 사람의 계좌에 돈을 넣어주는 쿼리.
				String sql1 = "update account set balance=balance+? where account_id =?";
				pstmt = conn.prepareStatement(sql1);
				pstmt.setInt(1, balance);
				pstmt.setString(2, toAccount);
				
				int result2 = pstmt.executeUpdate();
				if (result2 == 1) {
					System.out.println("이체 성공");
				} else {
					System.out.println("이체 실패");
				}

			} else {
				System.out.println("error : 출금 실패 ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

}
