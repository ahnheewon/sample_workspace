package P20220705;

public class Example03 {

	public static void main(String[] args) {
		// for반복문을 활용, 구구단 3단을 출력.

		int a = 1;
		int b = 0;
		for (int i = 1; i <= 9; i++) {
			b = 3 + b;

			System.out.println("3 * " + a + " = " + b);
			a = a + 1;

		}

	}

}
