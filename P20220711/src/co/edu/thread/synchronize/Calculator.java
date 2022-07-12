package co.edu.thread.synchronize;

public class Calculator {
private int memory; //필드생성
public int getMory() { 
return memory;
}
public synchronized void setMemory(int memory) {
	this.memory = memory;
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()+" : "+ this.memory);
}
	
	
}
