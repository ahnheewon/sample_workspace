package co.edu;

public class StudentMain {
	//필드 (instance field)
	private static String name;
	
	// 메소드 (static method)
	public static void main(String[] args) {
		
		System.out.println(args[0]+args[1]+args[2]);
	
		Student kim = new Student(); //null이 아닌 실체를 만든다 => 인스턴스를 만든다. => 사용가능
		
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);
		System.out.println("이름 : "+kim.getName());
		
//학생 추가
		Student park = new Student("22-002","박희수",14);		
		Student ahn = new Student("22-003","안희원",14);
		
		Course course = new Course("김철수","1-3",25);
		System.out.println("선생님 이름: "+course.getTname());
		System.out.println("반 정보: "+course.getBname());
		
		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(ahn);
		//학생 리스트
		course.getStudents();
		
		
		//최고점 학생의 정보 보기
		System.out.println("1등은??");
		course.getMaxScore().showInfo();
		
		System.out.println("반 평균은??");
		System.out.println(course.getAvgScore());

		
	}

}
