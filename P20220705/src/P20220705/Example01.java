package P20220705;

public class Example01 {

	public static void main(String[] args) {
		 // 1~ 100 수를 출력.
		
		/* //int A = (int) Math.random();
		int sum=0;
		for(int i=1; i<=100; i++)
			{sum= sum+1;
			System.out.println(sum);
			} 
			*/

		//짝수만 
		
		int sum=0;
		for(int i=1; i<=100; i++)
		{
			sum = sum + 1;
			if(sum % 2 == 0)
			{
			System.out.println(sum);
			}
			
			}
		
		
	}

}
