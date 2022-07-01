package co.edu;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		
		// String name = new String("홍길동");
		
		Scanner sn = new Scanner(System.in); //필수
		
	/*	
	    System.out.println("이름을 입력하세요.");
	
		String input = sn.nextLine(); //사용자가 입력한 값을 문자열로 읽어드리겠습니다.
		
		System.out.println("나이를 입력하세요.");
		int input2 = sn.nextInt(); //         "       정수열로 
		
		System.out.printf("이름은 %s, 나이는 %d살 입니다\n", input, input2);
	
	*/
		
	/*	System.out.println("첫 번째 값을 입력");
		int num1 = sn.nextInt();
		
		System.out.println("두 번째 값을 입력");
		int num2 = sn.nextInt();
		
		int result = num1 + num2;
	
		
		System.out.printf("입력값 %d와 %d의 합은 \n%d 입니다.", num1, num2, result);
		
		*/
	
		System.out.println("첫 번째 값을 입력");
		int num1 = sn.nextInt();		
		System.out.println("두 번째 값을 입력");
		int num2 = sn.nextInt();
		
		if(num1 > num2)
		{ int result = num1 - num2;
			System.out.printf("입력 값 %d과(와) %d의 차이는 \n%d 입니다.", num1, num2, result);
		}
		 else { int result = num2 - num1;
			System.out.printf("입력 값 %d과(와) %d의 차이는 \n%d 입니다.", num2, num1, result);
		 }
	
	

}}
