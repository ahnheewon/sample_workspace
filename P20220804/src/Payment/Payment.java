package Payment;

public interface Payment {
	//상수필드
	public static final double ONLINE_PAYMENT_RATIO=0.05;
	public static final double OFFLINE_PAYMENT_RATIO=0.03; //상수 이름은 대문자로

//  다음과 같이 추상 메서드를 가진다.
//  인터페이스에서는 abstract 생략가능! -> 어차피 오버라이드 해야해서
	public abstract int online(int price) ;
	public int offline(int price); 
	public void showInfo();
	
}
