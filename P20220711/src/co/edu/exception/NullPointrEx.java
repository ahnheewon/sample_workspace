package co.edu.exception;

/*
 * 인스턴스 참조변수 = null
 */
public class NullPointrEx {

	public static void main(String[] args) {
		
		String name = "홍길동";
		name = null;

//		System.out.println(name.toString()); // name이 null값인데 객체접근연산자(.)를 사용해서 에러 발생.

		try { 
			System.out.println(name.toString());
			System.out.println("name 을 출력합니다.");
		} catch (NullPointerException e) {
	//    System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료.");

	}

}
