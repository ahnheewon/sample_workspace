package co.edu.interfaces.database;

import java.util.Scanner;

public class WooriApp {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Dao db = new Mysql(); // mysql dbms.
		db = new Oracle();

		while (true) {
			System.out.println("1.입력 2.수정. 3.삭제 4.종료");
			System.out.printf("선택> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				db.insert();
			} else if (menu == 2) {
				db.update();
			} else if (menu == 3) {
				db.delete();
			} else if (menu == 4) {
				System.out.println("프로그램 종료.");
				break;

			}

		}
	}
}