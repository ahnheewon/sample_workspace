package co.edu;

public class Example01 {

	public static void main(String[] args) {
		
		System.out.println("동전계산기 입니다.");
	
	   int a=3;
	   int b=4;
	   int c=5;
	   
	   System.out.println("10원 짜리 개수는 "  + a + 
			   "개 ,\n100원 짜리 개수는 " + b + "개 , "
			   		+ "\n500원 짜리 개수는 " + c + "개 이므로 " );
	   
			   System.out.println(">> 총" + (a*10 + b*100 + c*500) + "원 입니다. ");
	   
		
		
		

	}

}
