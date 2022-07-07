package P20220706;

import java.util.Date;
import java.util.Scanner;

/*
 * 등록/ 조회/ 수정/ 삭제/ 리스트
 * 
 * id:user1, passwd: 1212 => 로그인 되었습니다!!
 * >> 패스워드가 틀리면 아이디, 비번 확인하세요. 문구 출력
 * 
 * 
 */

public class BoardApp {

	public static void main(String[] args) {

		Board[] boards = new Board[100];

		Scanner scn = new Scanner(System.in);

		// 로그인 처리기능

		boolean login = true;
		while (login) {

			System.out.println("아이디를 입력하세요.");
			String id = scn.nextLine();
			System.out.println("패스워드를 입력하세요.");
			int pd = Integer.parseInt(scn.nextLine());

			if (!id.equals("user1") || pd != 1212) {
				System.out.println("아이디 또는 비번 확인하세요.");

			} else if (id.equals("user1") && pd == 1212) {
				System.out.println("로그인 되었습니다.\n어서오세요 " + id + "님!\n");
				login = false;
			}
		}

		boolean run = true;
		while (run) {
			System.out.println("1. 등록 | 2. 조회 | 3. 수정 | 4. 삭제 | 5. 리스트 | 6. 종료 ");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine()); // scn.nextInt(); 은 왜 안되는가? 엔터값은 인식안하기 때문.
																// 그래서 다음 페이지에 엔터가 먹혀서 값이 넘어가진다...

			if (selectNo == 1) {
				// 게시글 등록 (제목, 내용, 작성자, 작성일시, 조회수(0));
				System.out.println("글 제목을 입력하세요.");
				String title = scn.nextLine();

				System.out.println("글 내용을 입력하세요.");
				String content = scn.nextLine();

				System.out.println("작성자명을 입력하세요.");
				String writer = scn.nextLine();

				Board b = new Board();
				b.setTitle(title);
				b.setContent(content);
				b.setWriter(writer);
				b.setCreateDate(new Date());
				b.setHitCount(0); // 조회수 0

				// 배열의 비어있는 위치에 저장.
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) { // 비어있으면
						boards[i] = b;
						break;
					}
				}
				System.out.println("정상적으로 입력했습니다.\n");

			} else if (selectNo == 2) {
				// 게시글 조회: 제목조회.
				System.out.println("조회할 제목을 입력하세요. >");

				int c = 0; // 초기화
				String findTitle = scn.nextLine();
				// null이 아닌 값만 찾아야 한다.
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateDate(),
								boards[i].getHitCount());
						// 카운트 증가.
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
						// ++cnt 조회한 즉시 +1
					} else
						c++;
				}
				if (c == boards.length)
					System.out.println("해당 내용을 찾을 수 없습니다.");

			}

			else if (selectNo == 3) {

			}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			else if (selectNo == 4) {

				int cnt = 0;
				System.out.println("삭제할 제목을 입력하세요. >");
				String delTitle = scn.nextLine();

//				for (int i = 0; i < boards.length; i++) {
//					if (boards[i].getTitle().equals(delTitle) && boards[i] != null) {
//
//						boards[i] = null;
//						System.out.println("정상적으로 삭제했습니다.");
//						break;
//					} else if ()
//						cnt++;
//						break;
//					}}
//					if (cnt == boards.length)
//						System.out.println("찾을 수 없습니다.");
				
			}

			else if (selectNo == 5) {
//				전체리스트를 보는 기능.
				System.out.println("=================글목록=====================");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) { // 보드가 비어있지 않다면
						System.out.printf("제목 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateDate(),
								boards[i].getHitCount());

					}

				}
			} else if (selectNo == 6) {
				System.out.println("프로그램 종료하겠습니다...");
				run = false;

			}

		}
		System.out.println("프로그램 종료.");

	}

}
