package co.edu;

public class BitOperator {
	public static void main(String[] args) {
		
		int num = 10;
		int result = ~num; // -11
		
		result++; // -10 2의 보수를 취한다.
		
		System.out.println(result);
		
		// 대입 연산자 : =, +=, -=, *=, /= ......
		String names = "홍길동";
	//	names = names + " 김민수"; 를 해보고 싶을 때
		
		names += " 김민수 박의식";
		
		System.out.println(names);
	   
		result = result -2 ;
		result -= 2;
		System.out.println(result);
	
	}

}
