package P20220705;

public class NestLoopExample01 {

	public static void main(String[] args) {

//		for (int i = 2; i <= 9; i++) { // 단
//		for (int j = 1; j <= 9; j++) { // 곱수
//				System.out.printf("\n%d x %d = %d", i, j, (j * 2));
//			}
//			System.out.printf("\n---------------");
//		}

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			System.out.println();

		}
	}
}