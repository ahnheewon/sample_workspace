package co.edu.loop;

public class ForExample {

	public static void main(String[] args) {
		/*
		 * int sum = 0;
		 * 
		 * 
		 * for (int i = 1; i <= 10; i++) {
		 * 
		 * if (i % 2 == 1) { sum = sum + i; System.out.println("i의 값: " + i +
		 * ", sum의 값: " + sum);
		 * 
		 * } } System.out.println("홀수 합: " + sum);
		 * 
		 */

		// 1,4,7,10 누적
		// 1 ~ 10 까지의 값을 result => 누적
		// 1 ~ 10 까지의 홀수 값만을 result => 누적	 
		
		//1번
		int result = 0;
		 for (int i = 1; i <= 10; i++) {
			 if (i % 2 == 1) { result = result + i;}

			  } System.out.println("홀수 합: " + result);
			  
			  System.out.println("--------------------");
		System.out.println("1, 4, 7, 10 누적 합 : " + result);
		System.out.println("--------------------");
		
		int result1 = 1;
		for (int i=0; i<=10; i++)
		{result += i;
		System.out.println(i);}
		System.out.println("홀수 누적 합 : " + result1);
		System.out.println("--------------------");
		
		//2번
		for (int i=1; i<=10; i++)
		{System.out.println(i);}
		System.out.println("--------------------");
		
		for (int i=10; i>=1; i--)
		{System.out.println(i);}
	
	
	}


}