package assginment.third;

public class Performance extends Culture {
//	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.

	String genre;

	// 생성자
	public Performance(String title, int directorNum, int actorNum) {
		super(title, directorNum, actorNum);
	}

//	- 메소드는 다음과 같이 정의한다.
	// (1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을
	// 출력하는 기능

	public void getInformation(){
		System.out.println("공연 제목: " + title);
		System.out.println("감독 수: " + directorNum);
		System.out.println("배우 수: " + actorNum);
		System.out.println("공연 총점: " + totalScore);
		System.out.println("공연 평점: " + getGrade());
			
	}
	}

