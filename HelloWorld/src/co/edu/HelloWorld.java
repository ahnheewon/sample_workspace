package co.edu;

public class HelloWorld {
	public static void main(String[] args) {
		 // 변수의 종류: int(정수), double(실수), boolean(논리), String(문자열)
		 // int(4byte) < double(8byte)
		
		String name = "안희원"; //클래스 앞글자는 대문자로 쓰는게 관례.
		
		// ↓my_age 라는 의미로 age의 앞글자를 대문자로 써준다. 관례. 맨 앞은 클래스가 아니므로 소문자.
		int myAge = 20; // 선언하면서 값을 할당 => 초기화.
		int yourAge;// 선언 : 초기화 (X)
		 yourAge = 22;
		 
		double height = 162.4;
		boolean isMarried = true; // or false
		String myAddress = "대구시";
		
		myAge = 30;
		height = 165.2;
		
		int result = myAge + yourAge; // 변수는 사용을 위해서 값이 할당.
		double result1 = (double) myAge + height;
		
		
		System.out.println(result);
		
		 System.out.println("안녕하세요 " + name + "입니다."		);
	}

}
