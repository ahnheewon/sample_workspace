package co.edu.thread.synchronize;

public class User2 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("User-2");
		this.calculator = calculator;
	}
		
	@Override
	public void run() {
		calculator.setMemory(50); //100 이라는 메모리 사용
	}

}
