package co.edu;
/*
 * 
 * 클래스 연습 StudentMain 사용.
 * 
 */
public class Student {
	// 필드.
	private String sno;
	private String name;
	private int score;

	// 생성자: 기본생성자.
	public Student() {}
	
	// 생성자 오버로딩 (생성자를 여러개 만드는 것)
	public Student(String sno, String name, int score) {
		this.sno=sno;
		this.name=name;
		this.score=score;
		
	}
	

	// getter, setter
	public void setSno(String sno) { // 학번(필드)에 매개 값을 대입.

		this.sno = sno; // 메인메소드랑 변수이름이 같은데
						// 우선순위는 이 메소드
	}

	public void setName(String name) { // 이름(필드)에 매개 값을 대입.

		this.name = name;

	}

	public void setScore(int score) { // 점수(필드)에 매개 값을 대입.

		this.score = score;

	}
	
	public String getSno() { // 매개값이 없고 학번 이라는 필드를 반환
							 // void 있으면 안됩니다 !!!!!
							 // return 이므로 변수 형태 지정해주기 !!!!!
		return sno;

	}
	public String getName() { // 매개값이 없고 이름 이라는 필드를 반환
		
		return name;
		
	}
	public int getScore() { // 매개값이 없고 점수 라는 필드를 반환
		
		return score;
		
	}

	//전체 정보를 보여주는 showInfo()
	public void showInfo() {
		
		System.out.printf("학번: %s, 이름:%s, 점수: %d\n", sno, name, score);
		
	}
}
