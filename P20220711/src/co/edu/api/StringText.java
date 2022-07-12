package co.edu.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringText {

	public static void main(String[] args) {
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트", "자 바" };
		// 1번 "자바" 문자열 포함.

		for (int i = 0; i < str.length; i++) {
			// System.out.println(str[i].indexOf("자바"));
			if (str[i].indexOf("자바") != -1) {
				System.out.println((i+1) + "번째 배열에는 자바 단어가 포함 된다.");
			} else if (str[i].indexOf("자바") == -1)
				System.out.println("하지만 "+(i+1) + "번째 배열에는 자바 단어가 포함 되지 않는다.");
		}
		System.out.println("=================================");
		String path = "c:/images/hello.png"; // 파일의 확장자, 파일명
		// 2번
		
		
		System.out.println(" 이 파일의 파일명은 ");
		System.out.println(" 이 파일의 확장자는 ");

		
		System.out.println("=================================");
		String tel = "";
		String[] tels = { " 031", " 210 3", "34 78 " };
		// 3번 공란을 제외해서 // tel에 031-2103-3478 이렇게 출력되도록?
		for (int i = 1; i < tels.length; i++) {
			  tels[i] = tels[i].replace(" ","");
			   
		} System.out.println(tels[0].trim()+"-"+tels[1].trim()+"-"+tels[2].trim());
		
		
		System.out.println("=================================");
		String[] ssn = { "970403-1234123", "010503 3456123", "980123/2412345", "0202023217891" };
		// 4번 남자 또는 여자를 나타내도록
		for (int i = 0; i < ssn.length; i++) {
			checkGender(ssn[i]);
			System.out.printf(ssn[i]);
			
			char s= ssn[i].charAt(7);
			if(s=='1' || s=='3') {
				System.out.println("남자");}
			else System.out.println("여자");}
			
			
		// System.out.println(dateToStr(new Date(), "yyyy년MM월dd일 HH:mm:ss"));
	}

	public static String dateToStr(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	public static void checkGender(String ssn) {
			
		ssn.replace(" ","");
		ssn.replace("/","");
		ssn.replace("-","");
		
	}

}
