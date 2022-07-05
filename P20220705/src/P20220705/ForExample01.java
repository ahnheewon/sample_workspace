package P20220705;

public class ForExample01 {

	public static void main(String[] args) {
		// 배열.

		int[] tempAry = new int[5];
	//	tempAry = new int[]{ 3, 4, 5, 6, 8 };
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50);

		}
		
		for (int num : tempAry) {
			System.out.println(num);
		}
		
		// 제일 큰 값을 알고 싶을 때 >> max;
		int max = 0;
		for (int i = 0; i < tempAry.length; i++)
			if (tempAry[i] > max) {
				max = tempAry[i];
			}

		System.out.println("제일 큰 값: " + max);
		

		
		
	}

}
