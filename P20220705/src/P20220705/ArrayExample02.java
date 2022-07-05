package P20220705;

public class ArrayExample02 {

	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
		// 배열의 크기: 5, intAry.length 해보면 알 수 있음.

		// 위치 세 번째 => 30;

		intAry[2] = 30;
		int temp = intAry[0]; //
		intAry[0] = intAry[1]; // [0]과 [1] 값 교체하려고 할 때
		intAry[1] = temp; //

		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {

			// if (i % 2 == 0) { // 순번이 짝수인경우
			// System.out.println(intAry[i]);}
			sum += intAry[i];
		}
		System.out.println("합계 : " + sum); //내용물의 총 합.
	}
}
