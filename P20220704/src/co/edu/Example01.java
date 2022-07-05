package co.edu;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("임의 숫자 입력>> ");
		int num1 = scn.nextInt();
		
		// 3의 배수가 맞는지? => 입력 6은 3의 배수입니다.
		
		if(num1 % 3 == 0) {
			System.out.println("3의 배수입니다.");}
		else{System.out.println("3의 배수가 아닙니다.");
		
		}
	}

}
