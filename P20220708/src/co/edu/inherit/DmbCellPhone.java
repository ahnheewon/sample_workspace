package co.edu.inherit;

/*
 * 상속 : 자식이 부모를 선택(extends)
 */

public class DmbCellPhone extends CellPhone {

    private int channel;

	public DmbCellPhone() {
		super(); // super는 부모를 의미.
					// 부모 클래스에 기본 생성자(default constructor)가 없으면 불가능.
	}

	public DmbCellPhone(String model, String color, int channl) {
		// this.model = model; // this는 자기 자신을 의미하는데 model 속성은 원래 부모 것이다.
		// 부모 클래스에서 model 속성이 private 이므로 마음대로 사용불가.

		super(model, color);// 부모 것은 super 로
		this.channel = channel; // 자기 것은 this로 표현해야 한다.
	}

	public void turnOn() {
		System.out.println("dmb화면 on");
	}

	public void turnOff() {
		System.out.println("dmb화면 off");
	}

	// overriding 재정의 source->override ~
	@Override
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	@Override
	public String toString() {
		return "model명은 " + super.getModel() + ", 색상은" + super.getColor() // private 이라서 super.get
				+ "채널은" + channel + "입니다.";
	}

}
