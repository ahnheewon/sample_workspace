package assginment.third;

import java.util.Scanner;

public abstract class Culture {
	Scanner scn = new Scanner(System.in);

//	- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	protected String title;
	protected int directorNum;
	protected int actorNum;
	protected int audienceNum=0;
	protected int totalScore=0;

//	- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	public Culture(String title, int directorNum, int actorNum) {
		this.title = title;
		this.directorNum = directorNum;
		this.actorNum = actorNum;
	}

//	- 메소드는 다음과 같이 정의한다.
//	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
	public void setTotalScore(int score) { // score는 평점..
		// 평점 인원 한 명 추가
		audienceNum++;
		// 총점에 평점 추가
		totalScore += score;
	}

//	(2) public String getGrade() : 평점을 구하는 기능
	public String getGrade() {
		String grade = null;
		int avg = totalScore / audienceNum;
		switch (avg) {
		case 1:
			grade = "☆";
			break;
		case 2:
			grade = "☆☆";
			break;
		case 3:
			grade = "☆☆☆";
			break;
		case 4:
			grade = "☆☆☆☆";
			break;
		case 5:
			grade = "☆☆☆☆☆";
			break;
		}
		return grade;
	}

//	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	public abstract void getInformation();

	// 추상화 하면 부모가 아닌 자식클래스에서 무조건 추상클래스를 재정의로 표현해야함.
}
