package co.edu.api;

import java.lang.reflect.Method;

public class ClassEx {

	public static void main(String[] args) {
		// 클래스의 정보 얻어오기.
		try {
			Class cls = Class.forName("java.lang.String");
			cls = String.class; //클래스의 정보들을 받아옴.
			
			System.out.println(cls.getName());
			Method[] methods = cls.getMethods();
			for(Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
