package assignment.second;

public class mainApp { // 실행

	public static void main(String[] args) {
		// StandardWeightInfo SWI = new StandardWeightInfo();
		// ObesityInfo OI= new ObesityInfo("박둘이",)
//		StandardWeightInfo SWI = new StandardWeightInfo("홍길동", 168, 45);
//		ObesityInfo OI = new ObesityInfo("박둘이", 168, 90);
//
//		SWI.getInformation();
//
//		OI.getInformation();
		
		Human h1 = new StandardWeightInfo("홍길동", 168, 45);
		h1.getInformation();
		Human h2 = new ObesityInfo("박둘이", 168, 90);
		h2.getInformation();
	}

}
