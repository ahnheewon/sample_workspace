package co.edu;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 사용자가 입력하는 값을 읽어서 100~ 90 사이면 A등급, ~80 :B , ~70 : C, ~그 외 :D
		// 출력값: 점수 78은 C 등급입니다.

		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scn.nextInt();

		String grade = "";
		
		
		if (score >= 90 && score <= 100) {
			if (score >= 95) {  // if절 안에 또 if-else 구문 추가
				{
					grade = "A+";
				}
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				{
					grade = "B+";
				}
			} else {
				grade = "B";
			}
		}

		else if (score >= 70) {
			if (score >= 75) {
				{
					grade = "C+";
				}
			} else {
				grade = "C";
			}
		} else if (score >= 65) {
			grade = "D+";
		} else {
			grade = "D";
		}

		System.out.printf("점수 %d 은(는) %s 등급입니다.", score, grade);

		// 삼항연산자로 나타내기
		/*
		 * String grade=""; grade = (score>=90) ? "A" : ((score>=80) ? "B" :
		 * ((score>=70) ? "C" : "D"));
		 * 
		 * System.out.printf("점수 %d 은(는) %s 등급입니다.",score , grade);
		 */
	}
}
