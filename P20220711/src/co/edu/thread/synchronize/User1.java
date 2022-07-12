package co.edu.thread.synchronize;

public class User1 extends Thread {
private Calculator calculator;

public void setCalculator(Calculator calculator) {
	setName("User-1");
	this.calculator = calculator;
}
	
@Override
public void run() {
	calculator.setMemory(100); //100 이라는 메모리 사용
}

}
