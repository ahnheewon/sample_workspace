package P20220706;

import java.util.Scanner;

public class MorningEx {

	public static void main(String[] args) {
		// p201 - 6번 문제

		boolean run = true;
		int studentNum = 0; // 학생수를 입력 받을때
		int[] scores = null; // 참조변수 -> 값이 아니라 주소값이 들어감.

		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("\n1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();

			// Integer.parseInt(scn.nextLine()); // =>문자열을 정수값으로 반환?
			// nextInt()=> 입력값을 받고 정수값으로 반환, nextLine()=> 문자열로 반환.
			if (!(selectNo == 1 || selectNo == 5)) {
				System.out.println(" 학생 수를 먼저 고르세요!!!!"); // 배열 크기 지정
				
				continue;
			}
			
			if (selectNo == 1) {
				System.out.println(" 학생수 입력 >>>"); // 배열 크기 지정
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				System.out.println("정상적으로 처리됨");

			} else if (selectNo == 2) {
				System.out.println(" 점수 입력 >>>"); // 배열 내용값 지정

				for (int i = 0; i < scores.length; i++) {
					System.out.println("학생" + (i + 1) + ">> ");
					scores[i] = scn.nextInt();
				}
			} else if (selectNo == 3) {
				System.out.println("점수 리스트>>");
				for (int i = 0; i < scores.length; i++)
					System.out.println("학생" + (i + 1) + ">>" + scores[i]);

			} else if (selectNo == 4) {
				System.out.println("분석 >>>>"); // 최고점수 평균점수

				int max = 0;
				int sum = 0;
				double avg = 0;

				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i])
						max = scores[i];

				}
			//	if.equals(max))
				System.out.println("최고점수는? " + max + " 점");

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = sum / studentNum;

				System.out.printf("\n학생들의 평균 점수는 %.2f\n", avg);

			} else if (selectNo == 5) {
				run = false;

			} 
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
