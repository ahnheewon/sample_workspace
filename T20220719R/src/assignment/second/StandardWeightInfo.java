package assignment.second;

public class StandardWeightInfo extends Human {
//	- Human 클래스를 상속한다.
	
	
// 생성자
	public StandardWeightInfo(String name, double tall, double weight) {
		super(name, tall, weight);
	}

//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation()  : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
//
	@Override
	public void getInformation() {
		System.out.println(
				name + "님의 신장 " + tall + ", 몸무게 " + (int) weight + ", 표준체중 " + getStandardWeight(tall) + " 입니다.");

	}

	public double getStandardWeight(double height) {
		double StandardWeight = (height - 100) * 0.9;
		return StandardWeight;
	}
}
