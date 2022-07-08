package co.edu.inherit;

public class MainExample {

	public static void main(String[] args) {
		
		
		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("Anycall");
		phone.setColor("white");
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();
		phone.powerOff();
		//부모가 가진 생성자, 필드 사용.

		phone.turnOn();
		phone.turnOff();
		phone.powerOff();
		//자식이 가진 생성자, 필드 사용.
		
		System.out.println("--------------------");
		// SmartPhone 기능. //손주도 물려받음.
		SmartPhone sphone = new SmartPhone ();
		sphone.setModel("Galaxy");
		sphone.setColor("Black");
		
		sphone.powerOn();
		sphone.powerOff();
		
		//부모 > 자식. 

		CellPhone dphone = new DmbCellPhone("아이폰", " 레드", 123);
		System.out.println(dphone.toString());
		CellPhone cphone = new CellPhone();
		
		dphone.powerOn(); //부모가 가진 것은 사용 가능
	//	dphone.turnOn(); // 자식이 가진 것은 사용하는건 불가능
		
//		long <- int : 자동형변환
			//	int <- long : 강제형변환
			//  상속도 강제형 변환이 가능하다.	
			
		if(cphone instanceof DmbCellPhone) {
		DmbCellPhone dcp = (DmbCellPhone) cphone; //cphone 타입은 원래 CellPhone.
			dcp.powerOff();
			dcp.turnOff();	
		}
		cphone.bell();
	//	System.out.println(cphone.toString()); //메모리의 주소값을 알려주는 기능.
		cphone.setModel("LG Phone");
		cphone.setColor(" 화이트");
		System.out.println(cphone.toString());
		

	
	}

}
