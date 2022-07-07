package co.edu;

public class MethodExample01 {
/*
 * 
 * 메소드 연습용.
 * 입력값(매개변수) 출력값(반환값)
 * 
 */
	public static void main(String[] args) {

		// int result = sum(10,20); → void라서 안됨.

		sum(10, 20); // void가 있으면 통째로

		int result = sum2(10, 20);
		System.out.println("결과 값은 :" + result);

		int result2 = sum2(sum2(3, 5), sum2(5, 7)); // 반환 값이기 때문에 이런식으로 가능.
		System.out.println("결과 값은 :" + result2);
		
		double result3 = properWeight(156.7);
		System.out.printf("적정 몸무게는  : %.1f",result3);
		
		double result4 = getTriangle(23.4,12.2);
		System.out.printf("\n삼각형의 넓이는 : %.1f",result4);
		
	}

	// 메소드 : 입력값 -> 처리 -> 출력값.
	public static void sum(int n1, int n2) {

		int result = n1 * 2 + n2 * 3;

		System.out.println("결과: " + result);

	}

	// ↓반환유형 void의 경우는 없음.
	public static int sum2(int n1, int n2) {

		int result = n1 * 2 + n2 * 3;
		return result; // sum2 메소드를 호출한 영역으로 결과 반환.
	}

	
	// 키 입력 -> 처리 -> 적정 몸무게 반환. (키-100) * 0.9:
	public static double properWeight(double height) {
		double weight = (height - 100) * 0.9;
		
		return weight;
	}
	
	
	//삼각형의 넓이 메소드 (밑변, 높이) => 삼각형의 넓이
	
	public static double getTriangle(double w, double h) {
		
		double getTriangle = w * h / 2;
		
		return getTriangle;
		
	}
	
	
	
}




