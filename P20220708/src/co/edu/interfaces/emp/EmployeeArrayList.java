package co.edu.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * 컬렉션 기반으로 기능 구현.
 * 
 */
public class EmployeeArrayList implements EmployeeList {

	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);
	// int empNum; // 필요없음. add 쓰면 비어있는 공간에 알아서 넣어줌.
	

	@Override
	public void init() {

		System.out.println("사원 수 > ");
		int num = Integer.parseInt(scn.nextLine());

		list = new ArrayList<>(num);

	}

	@Override
	public void input() {

		System.out.println("사번입력> ");
		int no = Integer.parseInt(scn.nextLine());

		System.out.println("이름> ");
		String name = scn.nextLine();

		System.out.println("급여> ");
		int sal = Integer.parseInt(scn.nextLine());

		list.add(new Employee(no, name, sal));

	}

	@Override
	public Employee search(int empId) { // empId는 사번
		
		for (int i = 0; i < list.size(); i++) {

			if (i == empId) {
				return list.get(i);
			}
		} // 조건문 다돌아봤는데 없으면 null

		return null;
	}

	@Override
	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%5d %10s %7d\n", list.get(i).getEmployeeId(), list.get(i).getName(),
					list.get(i).getSalary());
		}

	}

}
