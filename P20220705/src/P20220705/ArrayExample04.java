package P20220705;

public class ArrayExample04 {

	public static void main(String[] args) {
		// A반 (80, 85, 83)
		// B반 (79, 84, 90)

		int[][] banAry = new int[2][3];
		banAry = new int[][] { { 80, 85, 83 }, { 79, 84, 90 } };

		// A반 평균
		int sumA = 0;
		System.out.println(banAry[0][0]); //직접 쳐보거나 디버깅하면서....
		System.out.println(banAry[0].length);
		for (int i = 0; i < banAry[0].length; i++) { // a반만 나열
			sumA += banAry[0][i];
		}
		System.out.printf("A반 평균: %.1f \n", (double) sumA / banAry[0].length);
		// B반 평균
		int sumB = 0;
		for (int i = 0; i < banAry[1].length; i++) { // b반만 나열
			sumB += banAry[1][i];
		}
		System.out.printf("B반 평균: %.1f \n", (double) sumB / banAry[1].length);
	}
}
