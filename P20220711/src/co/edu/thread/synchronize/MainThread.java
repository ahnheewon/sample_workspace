package co.edu.thread.synchronize;

public class MainThread {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // user1과 user2가 공유해서 쓸

		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}
}
