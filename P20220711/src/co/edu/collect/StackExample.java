package co.edu.collect;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");

		// 하나씩 꺼내겠습니다 라는 메소드
		String elem = stack.pop();
		System.out.println(elem); // 제일 마지막

		elem = stack.pop();
		System.out.println(elem); // 박찬호를 뺐으니 그 마지막 김인수.
		
		System.out.println("============"); 
		elem = stack.peek();
		System.out.println(elem);
		elem = stack.pop();
		System.out.println(elem); // 김인수 뺐고 마지막 홍길동

		if (stack.isEmpty()) {
			System.out.println("비어있음");
		}

	}

}
