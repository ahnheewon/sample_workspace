package com.yedam.review;

public class StringAPI {
	public static void main(String[] args) {
		//100번지
		String a = "aaa";
		
		String b = "bbb";
		String c = new String("aaa");

		// a랑 b,c는 주소 값이 다르다.

		// String에서 '==' 와 같은 비교 연산자는 주소값을 비교한다.
		// .equals()는 데이터 값을 비교한다.

		System.out.println("a.equals(c) : " + a.equals(c));
		System.out.println("a == b : "+(a == b));
		System.out.println("a == c : "+(a == c));

		//"aaabbb" 101번지
		a = a + "bbb";
		StringBuilder sb = new StringBuilder();
		
		//100번지
		sb.append("aaa");
		System.out.println(sb.append("aaa"));
		//100번지
		sb.append("bb");

	}
}
