package com.pro.common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	//DAO
	//Data Access Object 데이터 접근 객체

		// java <-> DB 연결할 때 쓰는 객체
		protected Connection conn = null;
		// Select(조회) 결과 값 반환 받는 객체 //쿼리로 불러온 애들 집합
		protected ResultSet rs = null;
		// Query문을 담고 Query문을 실행하는 객체
		protected PreparedStatement pstmt = null;
		protected Statement stmt = null;

		Properties pro = new Properties();
		
		String driver = "";
		String url = "";
		String id = "";
		String pw = "";

		public void conn() {
			try {
				
				getProperties();
				// 1. 드라이버 로딩
				Class.forName(driver);
				// 2. DB 연결
				conn = DriverManager.getConnection(url, id, pw);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// 계속 열어둘 수 없으니 닫아준다. 순서대로
		public void disconnect() {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private void getProperties() {
			try {
				FileReader resource = new FileReader("src/config/db.properties");
				pro.load(resource);
				driver=pro.getProperty("driver");
				url=pro.getProperty("url");
				id=pro.getProperty("id");
				pw=pro.getProperty("pw");		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
