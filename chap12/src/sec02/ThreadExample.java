package sec02;

public class ThreadExample {

	public static void main(String[] args) {

		Thread movieThread = new MovieThread();
		movieThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		movieThread.interrupt();
		
		
	}

}
