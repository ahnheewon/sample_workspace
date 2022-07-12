package co.edu.thread;

import java.awt.Toolkit;

public class BeepWorkerThread extends Thread {

	@Override
	public void run() {
		Toolkit tookit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tookit.beep();
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();
		}
	}
}
