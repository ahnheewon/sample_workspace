package co.edu.io.memo;

import java.util.Scanner;

public class MemoApp {

	public static void main(String[] args) {
		MemoManager app = MemoManager.getInstance();

		// 메뉴 선택 => 선택값 => 구현
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("\n<1. 등록  2. 조회  3. 삭제  4. 목록  5. 종료 > ");
			System.out.print("\n번호 선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				app.inputData();
			} else if (selectNo == 2) {
				app.search();

			} else if (selectNo == 3) {
				app.deleteData();
			}

			else if (selectNo == 4) {

				for (int i = 0; i < app.memoStorage.size(); i++) {
					System.out.println(app.memoStorage.get(i).toString());

				}
			}

			else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				app.storeToFile();
				break;
			}
		}
	}
}
