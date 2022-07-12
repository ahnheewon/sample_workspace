package co.edu.collect.generic;

public class BoxExample2 {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
//		Integer result = box.get(); // <T>를 사용함으로써 컴파일 전 오류를 알려줌.
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer (boxing) 자유롭게 타입
		int result1 = intBox.get(); // Integer => int (unboxing)
	}

}
