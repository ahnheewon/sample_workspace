package co.edu.exception;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowExceptionEx {

	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void method1() throws ClassNotFoundException, SQLException {
		Class.forName("java.lang.String"); // 소스를 쓰는 것들은 컴파일 과정 중에 예외 처리를 해야합니다.
											// throw로 떠넘기든 try-catch 하든
		DriverManager.getConnection("","","");
		
	}

}
