package co.edu.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {


	public void run() {
	
	
		Toolkit tookit = Toolkit.getDefaultToolkit();
		for (int i=0; i< 5; i++)
			
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

	}
}
