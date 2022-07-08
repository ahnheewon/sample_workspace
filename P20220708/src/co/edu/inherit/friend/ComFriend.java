package co.edu.inherit.friend;

public class ComFriend extends Friend{

	//필드
	
		private String company;
		private String dptmt;
		
		public ComFriend(String name, String phone, String company, String dptmt) {
			super(name, phone);
			this.company = company;
			this.dptmt = dptmt;
		}

@Override
public String toString() {
return "회사친구 [이름: " + getName() + ", 연락처: " + getPhone() + ", 회사: " + company
					+ ", 부서: " + dptmt + "]";
		}
//대학친구 상세정보 재정의
	public void showInfo() {
		
		super.showInfo();
		
   System.out.printf("회사 이름: %5s 부서: %5s\n ",company,dptmt);
		
	}
		
		
	
}
