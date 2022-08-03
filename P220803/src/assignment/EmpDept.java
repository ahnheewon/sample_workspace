package assignment;

//- Employee 클래스를 상속한다.
public class EmpDept extends Employee {
//	- 추가로 부서이름을 필드로 가진다.
	private String deptName;
	
//	생성자를 이용하여 값을 초기화한다.
	public EmpDept(String name, int sal, String deptName) {
		super(name, sal);
		this.deptName = deptName;
	}

//	- 추가된 필드의 getter를 정의한다.

	public String getDeptName() {
		return deptName;
	}

//	- Employee 클래스의 메소드를 오버라이딩한다.

	@Override
	public void getInformation() {// 이름과 연봉을 출력하는 기능
		System.out.println("이름:" + name + " 연봉:" + sal + " 부서:" + deptName);

	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}

}
