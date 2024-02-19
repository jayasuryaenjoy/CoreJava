package Multithreading;

public class JavaClassImplents implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread by implements the runnable calss.....");
	}
	public static void main(String[] args) {
		JavaClassImplents javaClassImplents = new JavaClassImplents();
		Thread thread = new Thread(javaClassImplents);
		thread.start();
		
	}

}
