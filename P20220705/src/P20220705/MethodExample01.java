package P20220705;

public class MethodExample01 {

	public static void main(String[] args) {
		// 실행구문.
//	  long sum = sum((int) 10.3); // arguments(매개값)
//		showInfo("안희원", 34);
//		showInfo("홍길동", 24);
//	printStar(4,"*");
		printGuguda(13);
	}

	// 메소드 정의 구문.
	public static long sum(int num) { // parameter
		int result = num * 2;
		return result; // 자동형변환(promotion)

	}

	public static void printGuguda(int a) {
		for (int j = 1; j <= 9; j++)
			System.out.printf("%d x %d = %d\n", a, j, j * a);

	}

	public static void printStar(int times, String shape) {
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

//		for(int i=1; i<=times; i++)
//			{System.out.println(shape);}

	}

	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. \n나이는 " + age + "살 입니다.");
	}

}
