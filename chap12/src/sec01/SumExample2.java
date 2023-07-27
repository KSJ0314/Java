package sec01;

public class SumExample2 {

	public static void main(String[] args) {
		
		Runnable sumRunnable = new SumRunnable();

		Thread tr = new Thread(sumRunnable);
		
		tr.start();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				try {
					Thread.sleep(250);
					System.out.println(i);
					Thread.sleep(250);
				} catch (Exception e) {
				}
			}
		}

	}

}
