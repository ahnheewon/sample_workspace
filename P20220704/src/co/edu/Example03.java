package co.edu;

public class Example03 {

	public static void main(String[] args) {
		// 월 => , 31일 , 28일 ...'
		
		int month = (int) (Math.random()*12)+1; // 1 <= temp < 13
		System.out.println(month);
		
		
		int lastDate = -1;
		
		/* if (month==4 || month ==6 || month ==9 || month ==7 || month ==11) {
			lastDate = 30;
		} else if (month ==2) { lastDate=28;}
		else {lastDate =31;}
		
		 System.out.println(month + "월은\n" + lastDate +"일이 말일입니다");
	}
	*/
		 	 
		
	switch(month) {
	
	case 4:
	case 6:
	case 9:
	case 11:
		lastDate = 30; break;
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		lastDate = 31; break;
	case 2:
		lastDate = 28; break;
	}
	System.out.println(month + "\n월은" + lastDate +"일이 말일입니다");
	
	

		
	}
	}


