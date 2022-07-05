package co.edu;

public class CompareOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// ==, !=, >, >= <, <=
		
		if(num1 == num2) {
			System.out.println("두 수 같습니다.");
				
		}
		
		if(num1 != num2) {
			System.out.println("두 수 다릅니다.");
		}
		
		num1=20; // num2 =20;
		
		if(num1 >= num2) {
			System.out.println("num1이 num2보다 크거나 같습니다.");
		
		}
	     // 클래스의 값을 비교. String
		String name1 = new String("홍길동");
		String name2 = new String ("홍길동");
		System.out.println(name1+", "+name2);
		
	//	if (name1 == name2) {
		if (name1.equals(name2)) { //문자열을 비교할 경우에는 equals()
			System.out.println("두 값이 동일합니다.");
		} else { System.out.println("두 값이 동일합니다");
		
		String result = (name1.equals(name2)) ? "두 값이 동일합니다." : "두 값이 동일하지 않습니다.";
		
		//삼항 연산자.
		boolean isTrue = false;				
		if(num1>num2) {
			isTrue = true;
		} else { isTrue = false;
		}
		//삼항 연산자. if-else 구문을 대체하기 위해서 쓴다. 반환값이 반드시 있어야 함.
			isTrue = (num1>num2) ? true : false;
			result = (name1.equals(name2)) ? "true"	: "false"; // 문자열 반환 => result
			
	}

}}
