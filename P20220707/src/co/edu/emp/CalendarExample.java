package co.edu.emp;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 "); // Calendar 클래스는 0부터시작한다.
//		System.out.println(cal.get(Calendar.DATE) + "일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 일요일:1 ~ 토요일:7
//		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일날짜.

		cal.set(2020, 0, 0); // 2022년 6월 1일 지정.
//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 "); 
//		System.out.println(cal.get(Calendar.DATE) + "일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); 
//		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); 

		int year = 2022;
		int month = 8;
		String wd = "";

		if (getDayInfo(month) == 1)
			wd = "일요일";
		else if (getDayInfo(month) == 2)
			wd = "월요일";
		else if (getDayInfo(month) == 3)
			wd = "화요일";
		else if (getDayInfo(month) == 4)
			wd = "수요일";
		else if (getDayInfo(month) == 5)
			wd = "목요일";
		else if (getDayInfo(month) == 6)
			wd = "금요일";
		else if (getDayInfo(month) == 7)
			wd = "토요일";

		System.out.println(month + "월의 첫 날인 요일 " + wd);
	}

	// 년, 월 정보 => 해당 년, 월의 말일정보(메소드) 2022년 9월 => 30일
	public static int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		return cal.getActualMaximum(Calendar.DATE); // 말일정보를 가져오기
	}

	// 년, 월 정보 => 해당 년, 월의 1일의 요일정보(메소드) 2022년 9월 => 5요일.
	public static int getLastDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int firstDay = getDayInfo(month);
		return firstDay;
	}

	private static int getDayInfo(int mon) {
		switch (mon) {
		case 6:
			return 4; // 첫째날의 요일정보.
		case 7:
			return 6;
		case 8:
			return 2;
		case 9:
			return 5;
		default:
			return 0;
		}

	}
}
