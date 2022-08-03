package assginment.third;

public class mainApp {

	public static void main(String[] args) {

		Culture per = new Performance("지킬앤하이드", 7, 5);
		Culture mov = new Movie("추격자", 9, 10);
// 부모클래스 >>> 자식클래스 자동 타입변환
		
		mov.setTotalScore(6);
		mov.setTotalScore(2);
		mov.setTotalScore(2);
		mov.setTotalScore(2);
		mov.getInformation();
System.out.println("=======================");
		per.setTotalScore(6);
		per.setTotalScore(1);
		per.setTotalScore(2);
		per.setTotalScore(2);
		per.getInformation();
	}

}
