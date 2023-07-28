package sec02;

public class StopFlagExample {

	public static void main(String[] args) {

		Thread printThread = new PrintThread2();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		printThread.interrupt();
		
		
	}

}
