package P20220705;

public class Example02 {

	public static void main(String[] args) {

		int a = 0;
		boolean b = true;
		while (b) {
			a = a + 1;
			System.out.println(a);
			if (a == 10) {
				b = false;
			}

		}

	}
}