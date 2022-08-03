package assignment.second;

public class Human {
//	- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	String name;
	double tall;
	double weight;

	public Human(String name, double height, double weight) {

		this.name = name;
		this.tall = height;
		this.weight = weight;
	}

	// - 메소드는 다음과 같이 정의한다.
	public void getInformation() {
		System.out.println(name+"님의 신장 "+tall+", 몸무게 "+weight);
	}

}
