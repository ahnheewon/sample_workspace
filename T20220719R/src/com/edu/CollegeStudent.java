package com.edu;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.

	String Pname;
	String subject;
	
	// 생성자.
	public CollegeStudent(String studNo, String studName, int score, String Pname, String subject ) {
		super();
		this.Pname=Pname;
		this.subject=subject;

	// toString()
		
}

	@Override
	public String toString() {
		return "학생정보 [학번: " + getStudNo() + ", 이름: " + getStudName() + ", 점수 :" + getScore() + 
				"담당교수: "+Pname+ "전공과목: "+subject+"]";
	}
	


}

