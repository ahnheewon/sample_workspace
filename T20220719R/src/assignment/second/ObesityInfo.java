package assignment.second;

public class ObesityInfo extends StandardWeightInfo {

//	- StandardWeightInfo 클래스를 상속한다.

// 생성자
	public ObesityInfo(String name, double tall, double weight) {
		super(name, tall, weight);

	}

//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )

	@Override
	public void getInformation() {

		System.out.println(name + "님의 신장 " + tall + ", 몸무게 " + (int) weight + ", 비만도 : " + (int)getObesity(weight,tall) + " 입니다.");
	}

	public double getObesity(double weight, double height) {
		double Obesity = (weight - super.getStandardWeight(tall)) / super.getStandardWeight(tall) * 100;
		return Obesity;

	}
}
