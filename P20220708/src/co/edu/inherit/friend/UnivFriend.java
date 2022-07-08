package co.edu.inherit.friend;
/*
 * 학교친구.
 * 
 */
public class UnivFriend extends Friend{ //기본생성자이고, 상속받는 경우 부모 클래스에 기본 생성자가 없으면 에러가 납니다!
//필드
	
	private String univ;
	private String major;
	
//	생성자	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ=univ;
		this.major=major;
	}
	
// 재정의
	@Override
	public String toString() {
		return "대학친구 [이름: " + getName() + ", 연락처: " + getPhone() + ", 학교: " + univ + ", 전공: "
				+ major + "]";
	}
	
	//대학친구 상세정보 재정의
	public void showInfo() {
		
		super.showInfo();
		
     System.out.printf("학교이름: %5s 전공: %5s\n ",univ,major);
		
	}

	
}
