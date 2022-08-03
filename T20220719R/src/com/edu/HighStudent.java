package com.edu;

public class HighStudent extends Student {
//	고등학생정보 : 담임교사, 학년 정보 추가.

String Tname;
int grade;

	// 생성자.
public HighStudent(String studNo, String studName, int score, String Tname, int grade ) {
	super();
	this.grade=grade;
	this.Tname=Tname;
}

	// toString()

	@Override
	public String toString() {
		return "학생정보 [학번: " + getStudNo() + ", 이름: " + getStudName() + ", 점수 :" + getScore() + 
				"담임교사: "+Tname+ "학년 정보: "+grade+"]";}

}
