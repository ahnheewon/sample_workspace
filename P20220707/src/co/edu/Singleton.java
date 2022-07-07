package co.edu;

public class Singleton {

	// 싱글톤을 만드는 이유는 인스턴스를 여러 개 못만들도록 하기 위해서
	// 단 하나만 생성

	// 외부에서 호출 못하도록 private.
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {

		return instance;

	}

}
