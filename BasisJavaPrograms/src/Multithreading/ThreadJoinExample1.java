package Multithreading;

class ABCD extends Thread {
	Thread threadToInterrupt;

	public void run() {
		threadToInterrupt.interrupt();
	}
}

public class ThreadJoinExample1 {
	public static void main(String[] argvs) {
		try {
			ABCD th11 = new ABCD();

			th11.threadToInterrupt = Thread.currentThread();
			th11.start();
			th11.join();
		} catch (InterruptedException ex) {
			System.out.println("The exception has been caught. " + ex);
		}
	}
}