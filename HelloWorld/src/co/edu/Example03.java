package co.edu;
//문자열 타입의 변수 사용.
public class Example03 {
	public static void main(String[] args) {
		
		//10+20 => 30, "10"+"20" => "1020"
		
		System.out.println (10+20);
				System.out.println ("10"+"20");
				
				// 내 이름은 "홍길동" 입니다.
				
				System.out.println ( "내 이름은 \n홍길동\n 입니다.");
				
				// {"name":"홍길동", "age":20} json데이터타입.
				
				System.out.println("{\"name\":\"홍길동\", \"age\":20}");
				
				//문자열 -> 정수, 실수.
				int num1 = Integer.parseInt("100");
				double num2 = Double.parseDouble("123.4");
				double num3 = Double.parseDouble("122.01");
				System.out.println(num1 + num2);	
				
				int result = a(10, 12);
				System.out.println("메소드 a 결과: " + result);
		
				double r = b(12, 22.45);
				System.out.println("메소드 b 결과: " + r);
				
				double res = min(num2, num3);
				System.out.println("메소드 min 결과: " + res);
				System.out.printf("두 수의 차이는 %.2f 입니다.", res); // .2는 소숫점 둘째자리까지 표현한다는 뜻.
				System.out.printf("\n제 이름은 %s이고, 나이는 %d살 입니다.", "홍길동", 14);
				
				
				// 이름, 나이, 몸무게(소숫점) => 3개의 변수를 선언하시오.
				
				String a = "홍길동";
				int b = 23;
				double c = 56.953;
				
		System.out.printf("\n제 이름은 %s이고, 나이는 %d살이고, 몸무게는 %.2f kg입니다.", a , b , c);
				
	}
	
	// 2개의 숫자를 받아서 합한 결과를 반환하는 메소드.
	public static int a(int num1, int num2) { //반환타입 int 적기 안하면 void
		int a = num1 + num2;
		return a;
	}

	public static double b(int num1, double num2) {
		double b = num1 + num2;
		return b;
		
	
	}
	
	public static double min(double num1, double num2) {
		double min = num1 - num2;
		return min;
		}
	
}
