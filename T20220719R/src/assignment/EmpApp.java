package assignment;

import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {

		Employee employee = new EmpDept("이지은", 3000, "교육부");
		//클래스 선언은 '부모클래스'지만, 내용은 '자식클래스'인 경우 자동 타입 변환.
		
		employee.getInformation();
		employee.print();
		// 원래 부모클래스에서 적용해 놓은 대로 나와야 하는데
		// 자식클래스로 자동 타입 변환되었음. >> 다형성 
		
	}

}
