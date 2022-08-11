package com.pro.app;

import java.util.List;
import java.util.Scanner;

import com.pro.board.Board;
import com.pro.board.BoardManage;
import com.pro.board.BoardService;
import com.pro.member.MemberService;

public class M2enuToBoard { ///////////// 게시글 조회 메뉴화면.
	Scanner sc = new Scanner(System.in);
	BoardService bs = new BoardService();
	int menuNo = 0;

	public M2enuToBoard() {

		bs.getBoard();
		BoardDeepMenu();
	}

	private void BoardDeepMenu() {

		boolean run = true;
		while (run) {
			boardInfo();

			if (MemberService.memberInfo.getRole().equals("1")) {
				if (menuNo == 1) {

					bs.boardDeepInfo();
				} else if (menuNo == 2) {
					bs.getReportBoard();
				} else if (menuNo == 3) {
					bs.deleteBoard();
				} else if (menuNo == 4) {
					System.out.println("글 목록 갱신!");
					bs.getBoard();
				} else if (menuNo == 5) {
					run = false;
					System.out.println("뒤로 가기");
					break;
				}

			}
			// 일반 회원
			else if (MemberService.memberInfo.getRole().equals("0")) {
				if (menuNo == 1) {
					List<Board> list = BoardManage.getInstance().getListBoard();
					if (list.size() == 0) {
						System.out
								.println("==========================================================================");
						System.out.println("	 ....... 조회할 수 있는 글이 없습니다 ┌⊙◇⊙┘ .......");
						System.out
								.println("==========================================================================");
					} else
						bs.boardDeepInfo();
				} else if (menuNo == 2) {
					if (MemberService.memberInfo.getMemberPoint() < 3) {
						System.out.println("포인트가 부족합니다!");
					} else
						bs.createBoard();
				} else if (menuNo == 3) {
					bs.deleteBoard();
				} else if (menuNo == 4) {

					bs.getBoard();
				} else if (menuNo == 5) {
					run = false;
					System.out.println("뒤로 가기");
					break;
				}
			}
		}
	}

	private void boardInfo() {

		// role ==1, 관리자
		if (MemberService.memberInfo.getRole().equals("1")) { // 관리자 전용
			System.out.println(" 1. 글 조회 | 2. 신고 글 조회 | 3. 글 삭제 | 4. 글 목록 갱신 | 5. 뒤로 가기 ");

		}
		// role ==0, 일반 사용자
		else if (MemberService.memberInfo.getRole().equals("0")) { // 고객 전용
			System.out.println("(1) 글 조회 | (2) 새 글 작성 | (3) 글 삭제  | (4) 글 목록 갱신 | (5) 뒤로 가기 ");

		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(sc.nextLine());

	}
}
