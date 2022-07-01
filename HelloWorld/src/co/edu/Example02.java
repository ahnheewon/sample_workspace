package co.edu;

public class Example02 {

	public static void main(String[] args) {
		// 나의 키: 친구 키:
		
		int m = 161;
		int y = 150;
		
		double d = 0;
		
		if(m<y) { 
			d = y - m;
			System.out.println ("나의 키가 " + d + " cm 만큼 더 작습니다.");
		} else { 
			
		 d = m - y ;
			System.out.println ("나의 키가 " + d + "cm 만큼 더 큽니다.");
		}

	}

}
