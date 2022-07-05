package co.edu;

public class IfCondition {

	public static void main(String[] args) {
		int num = 6;
		
		// if ~ else
		if(num % 2==0)	{
		System.out.println(num + "은 짝수입니다.");
		} else { System.out.println(num + "은 홀수입니다.");
		}
		
		// if ~ else if ~ else
		if(num%2==0 && num%3 ==0	) {
			System.out.println("2와 3의 배수...");
		}
		
		if(num % 2 ==0)	{
			System.out.println("2의 배수입니다.");
			} else if (num%3 ==0){ System.out.println("3의 배수입니다.");
			} else { System.out.println("2 또는 3의 배수입니다.");
			}
	
	int score = 80;
	String grade = "";
	// 100 ~ 90 => A 등급, 89~80 => B, 79~70 => C 그 외 D
	if(score >= 90 && score <= 100)	{
		grade = "A";
		} else if (score >= 80){ grade = "B";
		} else if (score >= 70) {grade = "C"; }
		 else {grade = "D";
		}
	System.out.println(score + "점은 " + grade + "입니다.");
	
	}
	
}
