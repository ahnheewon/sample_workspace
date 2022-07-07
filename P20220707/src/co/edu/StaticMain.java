package co.edu;
/*
 * 
 * 정적메소드, 정적필드 사용 
 * 
 */
public class StaticMain {

	public static void main(String[] args) {
	// 정적 기능
//		Caculator cal = new Calculator();
//		System.out.println(cal.pi);
		
		System.out.println(Calculator.pi);
		Calculator.sum(10,20);
		
//      Singleton sing1 = new Singleton(); // private으로 막혀있음		
	
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();  // Math.random()이랑 비슷..
		
		System.out.println(sing1==sing2);
		
		
	}
	
	
}
