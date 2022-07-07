package co.edu;

public class Course {

	// 필드.
	private String tname;
	private String bname;
	private Student[] students;

	// 생성자.
	public Course() {
	}

	public Course(String tname) {
		this.tname = tname;
	}

	public Course(String tname, String bname, int studentNum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new Student[studentNum];
	}

	// 메소드

	public String getTname() {
		return tname;
	}

	public String getBname() {
		return bname;
	}

	public void getStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) // null이 아닐 경우에만
			{
				students[i].showInfo();
			}
		}

	}

	// 학생정보 등록.

	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}

	}
	// 점수가 제일 높은 "학생의 정보"를 반환.

	public Student getMaxScore() {
		int max = 0;
		Student student = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && max < students[i].getScore()) {
				max = students[i].getScore();
				student = students[i];
			}
		}
		return student;
	}

	// 반평균 반환.

	public double getAvgScore() {

		int sum = 0;
		int cnt = 0;
		double avg = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) { // null인 학생배열을 고려해야한다!!!
										// 시험을 안친 학생들까지 고려하면 안된다.
				sum += students[i].getScore();
				cnt++;
			}
		}

		avg = sum / cnt;

		return avg;

	}

}
