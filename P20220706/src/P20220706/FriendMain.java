package P20220706;

public class FriendMain {

	public static void main(String[] args) {
		//f1
		
		//String f1;
		
	Friend f1 = new Friend("홍길동","010-1234-1234",169);
    
//	f1.name="김유진";
	f1.setName("김민수");
//	f1.bday="78-05-23";
	f1.setNum("010-2222-3333");
//	f1.weight=34;
	f1.setWeight(-98);
	System.out.println("몸무게는:"+f1.getWeight());
	//필드에 접근제어를 하기위해 set - get 
	
	f1.setHeight(-170);
	System.out.println("키는:"+f1.getHeight());
	
	f1.showInfo();
	f1.weight();
}
}