package assignment;

public class Employee {
//	- 이름과 연봉을 필드로 가진다.

	//필드
	protected String name; //default는 상속자가 사용 못하지만 protected는 사용 가능
	protected int sal;
	
	//생성자를 이용하여 값을 초기화한다.
	public Employee(String name, int sal) {	
		this.name=name;
		this.sal=sal;	
	}
	
//	- 각 필드의 getter만 존재한다.
// setter의 기능은 생성자에서 이미 사용.
	
	public String getName() {
		return name;
	}

	public int getSal() {
		return sal;
	}
	
//	- 메소드는 다음과 같이 정의한다.

	public void getInformation() {// 이름과 연봉을 출력하는 기능
		System.out.println("이름: " + name + "연봉: " + sal);

	}

	public void print() {
		System.out.println("수퍼클래스");
	}

}
