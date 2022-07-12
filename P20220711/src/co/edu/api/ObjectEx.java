package co.edu.api;

class Member extends Object { // extends Object가 없더라도 기본적으로 상속됨.

	String id;
	int age;

	@Override // 주소값이 달라도 그 내용값이 같으면 true가 나오도록 재정의.
	public boolean equals(Object obj) {

		if (obj instanceof Member) { // obj가 Member클래스의 인스턴스인가
			boolean b1 = this.id.equals(((Member) obj).id);
			boolean b2 = this.age == (((Member) obj).age);
			return b1 && b2;
		}
		return false; // obj가 Member클래스의 인스턴스가 아니면 항상 false 리턴.
	}

	@Override
	public String toString() {
		return "아이디: " + id + " 나이: " + age;
	}
}

public class ObjectEx {

	public static void main(String[] args) {

		Object obj1 = new Object(); // instance => 주소값.
		Object obj2 = new Object(); // instance => 주소값.

		System.out.println(obj1.equals(obj2)); // => 주소값이 다르기 때문에 서로 다르다고 나온다.
		System.out.println(obj1.toString()); // Object.toString() => 주소값

		// Object클래스의 자손인 String에도 equals()메소드 사용가능.
		String name1 = new String("홍길동");
		String name2 = new String("김길동");
		String name3 = new String("홍길동");

		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.toString()); // String.toString() => 재정의 되어있어서 문자열

		Member member1 = new Member();
		member1.id = "user1";
		member1.age = 10;

		Member member2 = new Member();
		member2.id = "user1";
		member2.age = 10;

		System.out.println(member1.equals(member2)); // 주소값이 달라서 false라고만 나온다.
														// 재정의 이후 true 값으로 나온다. 주소값이 달라도 그 내용값이 같으면 true가 나오게 바꿈.

		System.out.println(member1.toString()); // Object.toString() => 주소값
											    // 재정의 이후 String 값으로 나온다.
	}

}
