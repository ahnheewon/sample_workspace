package co.edu;

public class Variable {
	public static void main(String[] args) {
    	 byte b1 = 10; // -128< byte < 127
    	 short s1 = 0;
    	 int n1 = 0;
    	 long l1 = 8L; // 정수 8이 아니라 long 타입 8임을 나타냄.
    	 
    	 // byte result = b1 + 20; // b1을 int 타입으로 바꿔버림. 그러므로 
    	 int result = b1 + 20;
    	 //int result1 = l1 + 20; 라고 하면 타입이 달라서 안되므로
    	 long result1 = l1 + (long) 20;
    	 result = (int) l1 + 20; // 강제형 변환
    	     	 
    	 System.out.println(result1);
    	 System.out.println(result);
    	 
    	char c1 = 'A';
    	System.out.println((int) c1+1); //문자형을 강제로 int로 변환했음.
    	
    	c1++; // 정수형 int 연산을 할 수 없어서 이런 식으로... 내용은 c1 = c1 + 1 과 같다.
    	System.out.println(c1); // A다음엔 B가 나온다
    	
    	c1 = 'A';
    	for(int i=0; i<25; i++)	{
    		System.out.println(c1++);
    	}
 //      이력변경추가 2022.07.01 12:55
    	System.out.println("이력변경추가");
     }
}
