package co.edu.inherit.friend;

public class Friend {
	//필드
	private String name;
	private String phone;
	
	//생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//재정의 필드
	@Override
	public String toString() {
		return "그냥친구 [이름: " + name + ", 연락처: " + phone + "]";
	}
	
	public void showInfo() {
		// 그냥 친구이름, 연락처
		// 대학 학교이름, 전공
		// 회사 회사이름, 부서
     System.out.printf("친구이름: %4s 연락처: %14s\n",name, phone);
		
	}
	
	
}
