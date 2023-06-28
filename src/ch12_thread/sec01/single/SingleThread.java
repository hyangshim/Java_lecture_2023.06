package ch12_thread.sec01.single;

import java.awt.Toolkit;

public class SingleThread {
	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			SingleThread.sleep(1000);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
			
		}
	}

}
