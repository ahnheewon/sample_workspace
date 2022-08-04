package Payment;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardPayment c = new CardPayment(0.08);
		Payment s = new SimplePayment(0.05); 
		// 다형성의 개념 적용됨.
		// 타입은 부모타입이지만, 자식클래스의 생성자를 통해 객체 생성
		// 하나의 부모클래스에서 다양한 자식들의 오버라이딩 가능
		int online = s.online(10000);
		int offline = s.offline(10000);
		int conline = c.online(10000);
		int coffline = c.offline(10000);
		
		
		c.showInfo();
		System.out.println("온라인 결제금액 : "+conline);
		System.out.println("오프라인 결제금액 : "+coffline);	
		
		s.showInfo();
		System.out.println("온라인 결제금액 : "+online);
		System.out.println("오프라인 결제금액 : "+offline);
		
		
		
		
		
		
		
	}

}
