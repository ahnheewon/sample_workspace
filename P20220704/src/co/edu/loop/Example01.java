package co.edu.loop;

public class Example01 {

	public static void main(String[] args) {

		// for 반복문으로 10번 반복.
		// num 변수 <= 1 ~ 10 까지의 임의 정수. Math.random();
		// sum 변수 <= 2의 배수.

		int num, sum2 ,sum3; //2의배수 3의배수를 각각 다른 변수에 담고 싶다.
		sum2 = 0;
		sum3 = 0;

		for (int i=1; i<=10; i++) {
			// sum2=0; sum3=0; for문 안쪽에 초기화문을 넣으면 누적값이 되지 않는다!!
			
			num=(int)(Math.random() * 10) + 1;
			
	
			if(num % 2 == 0 ) {
				sum2 += num;
				System.out.println("임의 숫자: " + num + ", 2의 배수 "+sum2 );}
			if (num % 3 == 0)
			{ sum3 += num;
			System.out.println("임의 숫자: " +num +", 3의 배수 "+ sum3);}
}
		System.out.println("---------------");
System.out.println("2의 배수의 합계: "+ sum2);
System.out.println("3의 배수의 합계: "+ sum3);
		}}
