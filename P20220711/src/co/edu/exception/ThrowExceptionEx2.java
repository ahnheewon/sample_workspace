package co.edu.exception;

public class ThrowExceptionEx2 {

	public static void main(String[] args) {
		// String[] str = { "100", "200", null, "ten" }; // 배열은 4개
		String[] str = { "100", "200", "300", "400" };

		try {
			subMethod(str);
		} catch (NumberFormatException e) {
			System.out.println("예외종류: NumberFormat 예외.");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("예외종류: 배열 범위 초과 예외.");
		} catch (Exception e2) {
			System.out.println("그외 예외: 알 수 없는 예외.");
		} finally { // 정상적인 실행 또는 예외가 발생해도 반드시 실행하는 코드
			System.out.println("프로그램 정상 종료 진행.");
		}
		System.out.println("프로그램 종료.");
	}

	public static void subMethod(String[] strAry)

			throws NumberFormatException, ArrayIndexOutOfBoundsException {

		for (int i = 0; i < 4; i++) {

			int num = Integer.parseInt(strAry[i]); // 문자열->정수 에러 발생
			System.out.println(num);

		}

	}
}
