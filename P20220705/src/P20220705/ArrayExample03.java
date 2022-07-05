package P20220705;

public class ArrayExample03 {

	public static void main(String[] args) {

		// 배열 선언.
		int[] intAry = { 22, 33 };
		intAry = new int[] { 24, 56, 77, 43, 99 }; // 변수에 배열 재할당.
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}

		double avg = (double) sum / intAry.length; // double 타입으로 강제변환 해주어야 소숫점이 살아있다.
		System.out.printf("합계 : %d, 평균 %.1f 입니다.\n", sum, avg);

		// 다차원 배열 선언.
		int[][] nestAry = new int[2][3];
		nestAry[0][0] = 10;
		nestAry[0][2] = 30;
		nestAry[1][1] = 40;

		System.out.println("nestAry 첫번째 배열.");
		for (int i = 0; i < nestAry[0].length; i++) { // 0번째 행의 배열
			System.out.println(nestAry[0][i]);
		}

		System.out.println("nestAry 두번째 배열.");
		for (int i = 0; i < nestAry[1].length; i++) { // 1번째 행의 배열
			System.out.println(nestAry[1][i]);
		}
		
		nestAry = new int[][] {{1,2},{3,4,5},{6,7,8}}; // 이럴 경우엔?
			
		System.out.println("중첩배열.");
		for (int i = 0; i < nestAry.length; i++) { // 행
			for (int j = 0; j < nestAry[i].length; j++) // 열
			{
				System.out.println("("+i+","+j+")=>"+nestAry[i][j]);
			}
			

			
		}

	}
}
