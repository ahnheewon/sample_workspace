package P20220705;

public class ArrayExample01 {
	public static void main(String[] args) {
		// 배열의 저장공간 선언.

		int[] intAry = new int[10]; // 저장공간 10개인 객체.

		intAry[0] = 10; // 첫번째 위치 10이라는 값을 할당.
		intAry[4] = 50;
		System.out.println(intAry.length); // 배열의 크기를 나타내는 읽기전용

		for (int i = 0; i < 10; i++) {
			System.out.println(intAry[i]);
		}

		double[] dblAry = new double[5]; // double형 공간 5개 선언.
		for (int i = 0; i < dblAry.length; i++) // 배열의 크기 만큼 반복.
		{
			System.out.println(dblAry[i]);
		}

		boolean[] boolAry = new boolean[3]; // boolean 형 공간 3개 선언.
		boolAry[1] = true;
		// boolAry[2]= "true"; 문자형 말고 boolean형 대입.
		for (int i = 0; i < boolAry.length; i++) // 배열의 크기 만큼 반복.
		{
			System.out.println(boolAry[i]);
		}
		String[] strAry = {"홍길동", "김민수", "허민기"}; //크기 말고도 값을 직접 넣으며 선언 가능	
		//strAry[3]="황경영"; //크기가 0~2 이므로 불가능, 문법상으로는 오류가 아니지만 실행 오류 발생!
		strAry[2]="황경영"; //허민기 -> 황경영으로 교체.
		
		for(int i=0; i <strAry.length; i++)
		{ System.out.println(strAry[i]);
		}
	}
}
