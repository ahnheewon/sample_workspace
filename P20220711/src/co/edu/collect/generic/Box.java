package co.edu.collect.generic;

/*
 * 책에 없는 내용.
 * 제네릭 : 타입을 클래스 정의 시점이 아니라 사용하는 시점에 지정.
 * 
 */
public class Box<T> { // <T> =>> Box 클래스의 타입을 사용시점에 정하도록 하겠습니다.

	private T obj;

	public void set(T obj) {

		this.obj = obj;
	}

	public T get() {
		return obj;
	}

}
