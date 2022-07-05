package P20220705;

import java.util.Scanner;

public class ForExample02 {
	
	// 메소드 정의 구문
	public static int sumAry(int[] num) { //정수 타입의 배열을 받겠다.
		int sum=0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
			return sum;
	}

	public static void main(String[] args) {

		// 1 배열의 합과 평균

//		int sum =0;
//		double avg=0;
//		int[] intAry = { 34, 23, 56, 22, 99, 28 };
//		
//		for(int i=0; i<intAry.length; i++)
//		{ sum += intAry[i];
//		}
//		sum= sumAry(intAry);
//		avg = (double)sum/intAry.length;
//		
//		System.out.printf("배열의 합은 %d, 평균은 %.1f 입니다.",sum,avg);
//		
//		

//		//2 intArray배열의 합과 평균.
		
//		int[]intArray = new int[6];
//		for(int i=0; i<intArray.length; i++) {
//			
//			intArray[i]=(int)(Math.random()*100)+1; // 1<x<101
//		}
//		
//		System.out.println("랜덤 배열의 구성값은");
//		for(int i = 0; i < intArray.length; i++)
//			{System.out.printf("%d ",intArray[i]);}
//
//		
//		
//		int sum=0;
//		double avg=0;
		
/*		for(int i=0; i<intArray.length; i++) {
			
			sum+=intArray[i];							
		} 
*/		
//		sum= sumAry(intArray);
//		avg = (double)sum/intArray.length;
//		System.out.printf("\n배열의 합은 %d, 평균은 %.1f 입니다.",sum,avg);
	

		// 3 scanArray 배열의 합과 평균.

		int[] scanArray = new int[5];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < scanArray.length; i++) {
			System.out.println("임의의 수를 입력 >> ");
			scanArray[i] = scn.nextInt();
		}
		
		System.out.println("입력한 내용으로 만들어진 배열 값은..");
		for(int i = 0; i < scanArray.length; i++)
			{System.out.printf("%d ",scanArray[i]);}
//
		int sum = 0;
		double avg = 0;
//		for (int i = 0; i < scanArray.length; i++) {
//
//			sum += scanArray[i];
//		}
		
		sum= sumAry(scanArray);
		avg = (double)sum/scanArray.length;
		
		System.out.printf("\n\n배열의 합은 %d, 평균은 %.1f 입니다.", sum, avg);

	}
}
