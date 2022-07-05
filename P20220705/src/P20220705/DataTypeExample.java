package P20220705;

class Person {
	
	String name;
	int age;
	
}

public class DataTypeExample {

	public static void main(String[] args) {
		
		
		int num1 = 100;
		int num2 = num1; // num1의 실제값 100이 담김.
		
		num1= 200;
		
		System.out.println("num1 :"+ num1); //stack : 100 -> 200 으로 바뀜.
		System.out.println("num2 :"+ num2); //stack : 100 -> 100 num1이 바뀌었는데도 변하지 않음.
	
	Person p1 = new Person();
	p1.name = "홍길동";
	p1.age = 20;
	
	Person p2= p1; //참조하는 주소값을 담아줌.
	
	p1.name = "박길동";
	p1.age =22;               // 이번엔 p1 , p2 값이 전부 바뀌었음.

	p2.name = "김길동";
	p2.age =22;               // p1, p2 똑같은 주소 값이기 때문에 같이 바뀜.
	
	System.out.println("p1의 이름 : "+ p1.name + ", p1의 나이 : "+ p1.age);
	System.out.println("p2의 이름 : "+p2.name + ", p2의 나이 : "+ p2.age);

			
	}

}
