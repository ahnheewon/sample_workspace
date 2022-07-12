package co.edu.collect.generic;

public class BoxExample {

	public static void main(String[] args) {
		Box strBox =new Box();
		strBox.set(new String("문자열")); // 매개값 : Object
		String result = (String) strBox.get(); // 강제 변환
		System.out.println(result);
	//
	//
	//
	//
	// 코드가 너무 길어지면 Box가 무슨 타입인지 까먹게 돼서 잘못된 타입을 적게 되는데..
		Integer result2 = (Integer) strBox.get();
	// 실행을 하면 에러가 나게 된다.
	// 컴파일 시점에서 아는 법? <T> 사용
		System.out.println(result2);
		
		Box intBox = new Box();
		intBox.set(new Integer(100));
		Integer result1 = (Integer)	intBox.get();
		System.out.println(result1);
	}

}
