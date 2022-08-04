package Dictionery;

import java.util.HashMap;
import java.util.Scanner;

public class DictioneryApp {
//필드
	Scanner s = new Scanner(System.in);
	HashMap<String, String> map = new HashMap<>();
	String menuNo = "";

//생성자
	public DictioneryApp() {
		run();
	}

	private void run() {

		while (!menuNo.equals("99")) { // 99가 아니면 true
			System.out.println("*********************************************************************************");
			System.out.println("1. 단어 등록  2. 단어 전체 조회.  3. 단어 검색  4. 단어 수정  5. 단어 삭제  99. 종료");
			System.out.println("*********************************************************************************");
			System.out.println("입력>");

			menuNo = s.nextLine();

			// 단어 등록
			if (menuNo.equals("1")) {
				String word = "";
				while (true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					System.out.println("입력>");
					word = s.nextLine();
					if (word.equals("q")) {
						break;
					}
					System.out.println("뜻 입력>");
					String mean = s.nextLine();
					map.put(word, mean); // 맵에 담는다.

				}
			}
			// 단어 전체 조회
			else if (menuNo.equals("2")) {
				if (map.size() == 0) {
					System.out.println("등록된 단어가 없습니다.");
				} else {
					System.out.println("********예담 단어장********");

					for (String key : map.keySet()) {
						// 향상된 for문으로 key를 가져옴.
						// 가져온 key를 활용하여 value를 가져옴.
						// 더이상 가져올 key가 없으면 종료.
						String value = map.get(key);
						System.out.println("단어 : " + key + "\n 뜻 : " + value);
					}
				}
			}
			// 단어 검색
			else if (menuNo.equals("3")) {
				System.out.println("단어 입력>");
				String key = s.nextLine();
				if (map.containsKey(key)) { // 이 값이 map에 들어있는 key에 존재하는 지 비교.
					String value = map.get(key); // 있으면 그 키 값을 활용해 value 가져오기.
					System.out.println("단어 : " + key + "\n 뜻 : " + value);
				} else
					System.out.println("등록되지 않은 단어입니다.");
			}
			// 단어 수정
			else if (menuNo.equals("4")) {
				System.out.println("수정 단어 입력> "); // map의 중복값을 못담는 성질을 이용한다.
				String key = s.nextLine();
				if (map.containsKey(key)) {
					System.out.println("수정 할 뜻>");
					String value = s.nextLine();
					map.put(key, value); // key값은 고유하므로 value 값을 덮어 씌운다.
				} else
					System.out.println("등록되지 않은 단어입니다.");
			}
			// 단어 삭제
			else if (menuNo.equals("5")) {
				System.out.println("1. 한 단어 삭제  2. 전체 삭제");
				System.out.println("입력> ");
				String menu = s.nextLine();
				// 한 단어 삭제
				if (menu.equals("1")) {
					System.out.println("삭제 단어 입력> ");
					String key = s.nextLine();
					if (!map.containsKey(key))
						System.out.println("등록되지 않은 단어입니다.");
					else {
						map.remove(key);
						if (!map.containsKey(key)) {
							System.out.println("삭제가 완료되었습니다.");
						} else
							System.out.println("error : 삭제에 실패했습니다.\n 관리자에게 문의바랍니다.");
					}
				}
				// 전체 삭제
				else if (menu.equals("2")) {
					map.clear();
					if (map.size() == 0)
						System.out.println("삭제가 완료되었습니다.");
					else
						System.out.println("error : 삭제에 실패했습니다.\n 관리자에게 문의바랍니다.");
				} else if (menu.equals("99")) {
					break;
				}
			}

		}

	}
//메소드
}
