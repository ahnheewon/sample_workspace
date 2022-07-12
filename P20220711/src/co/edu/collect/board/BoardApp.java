package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		BoardDAO app = BoardDAO.getinstance();

		// 메뉴 선택 => 선택값 => 구현
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("\n<1. 목록  2. 등록  3.조회(작성자)  4. 삭제  5. 종료 > ");
			System.out.print("\n번호 선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if (selectNo == 1) {
				List<Board> a = new ArrayList<>();
			
			System.out.println(a);
			
			} else if (selectNo == 2) {

				System.out.print("제목> ");
				String title = scn.nextLine();
				System.out.print("작성자> ");
				String writer = scn.nextLine();
				System.out.print("내용> ");
				String content = scn.nextLine();

				Board board = new Board(title, writer, content);
				app.add(board);

			} else if (selectNo == 3) {
				System.out.print("조회하고 싶은 작성자를 입력하세요 > ");
				String writer = scn.nextLine();
				search(writer);
			
				
			} else if (selectNo == 4) {

			}

			else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

	private static void search(String writer) {
		// TODO Auto-generated method stub
		
	}
}
