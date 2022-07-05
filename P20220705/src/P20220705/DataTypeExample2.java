package P20220705;

public class DataTypeExample2 {

	public static void main(String[] args) {
		// 기본 데이터 타입. (byte,short,long,int,float,double,boolean)
		int num1 = 100;
		int num2 = 100;

		System.out.println(num1 == num2);

		// 참조 데이터 타입
		String str1 = new String("홍길동"); // 홍길동 객체 주소 값.
		String str2 = new String("홍길동"); // 홍길동 객체 주소 값.
		System.out.println(str1 == str2); // >> st1과 str2가 다르다고 나온다.
		System.out.println(str1.equals(str2)); // 값을 비교
	
		int result = 0;
		str1 = null;
		System.out.println(str1.equals(str2)); // 값을 비교
	}

}
