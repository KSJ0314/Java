package sec01;

public class SumExample {

	public static void main(String[] args) {

		Thread tr = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					if (i % 2 == 1) {
						try {
							System.out.println(i);
							Thread.sleep(500);
						} catch (Exception e) {
						}
					}
				}

			}

		});
		
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
