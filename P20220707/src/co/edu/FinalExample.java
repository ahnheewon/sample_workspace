package co.edu;

/*
 * 상수 vs 변수
 * 변수에 final 붙으면 상수가 된다.
 * 메소드에 final 붙으면 재정의(overriding) 불가. 
 * 클래스에 final 붙으면 상속이 불가.
 * 
 */


/*
 * 클래스 선언은 파일 1개에 1개 작성이 원칙. (많이 하면 나중에 찾기 힘듦.)
 */

class Person {	 
	final String ssn; // 주민번호
	String name;

	public Person(String ssn, String name) { //  private <-> public  서로 상충
		
		this.ssn= ssn;
		this.name=name;
	}
	
}

public class FinalExample {

	public static void main(String[] args) {
		
		// 변수.
		String name = "홍길동";
		name = "김민수";
		
		// 상수. 변수타입 앞에 final
		final int num = 10;
	//	num=20; // final 때문에 새로운 값으로 초기화 불가능.
		
	//	Person person = new Person(); // 에러가 난 이유는 기본 생성자가 규칙이 있기 때문이다.
										
		Person person = new Person("991234-1234567","홍길동");
		person.name = "홍민수";
	//	person.ssn="991234-7654321"; // final 상수 라서 다른 클래스에서도 바꿀 수 없다.
		
	}
	
	
}
