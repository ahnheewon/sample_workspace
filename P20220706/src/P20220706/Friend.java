package P20220706;

/*
 * 
 * 이름, 연락처, email, 생일, 키, 몸무게:
 * 
 */
public class Friend {

	// 필드. 명명규칙(소문자, camelCase, 영문, )

	private String name;
	private String num;
	private String email;
	private String bday;
	private double height;
	private double weight;

	// 생성자: 기본생성자를 생성.

	public Friend(String name, String num, double height) {
		this.name = name;
		this.num = num;
		this.height = height;
	}

	// 메소드 이름, 연락처를 보여주는 showInfo()

	public void showInfo() {
		System.out.println("이름: " + name + ", 연락처: " + num);
	}

	public void weight() {
		System.out.println(name + "의 몸무게는 " + weight + "kg");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setNum(String num) {
		this.num = num;
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			this.weight = 67;
			System.out.println("잘못된 값이 입력됐습니다.");
		} else

			this.weight = weight;

	}

	public void setHeight(double height) {
		if (height < 0) {

			this.height = 165.2;
			System.out.println("잘못된 값이 입력됐습니다.");
		} else

			this.height = height;

	}

	public double getHeight() {

		return height;
	}

	public double getWeight() {

		return weight;
	}

	public String getName() {
		return name;
	}

	public String getNum() {
		return num;
	}

	public String getEmail() {
		return email;
	}

	public String getBday() {
		return bday;
	}

}
