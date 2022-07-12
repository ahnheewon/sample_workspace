package co.edu.api;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		ssn = "0106241230123"; // 이렇게 적으면 여자로 나오는데..
		checkGender(ssn);

	}// end of main()

	public static void checkGender(String ssn) {
		
//		if (ssn.length() == 14) 
//			char sex = ssn.charAt(8);
//		 else if (ssn.length() == 13)
//			sex = ssn.charAt(7);
//
//		switch (sex) {
//		case '1':
//		case '3':
//			System.out.println("남자 입니다.");
//			break;
//
//		case '2':
//		case '4':
//			System.out.println("여자 입니다.");
//			break;
//		}

	}
}