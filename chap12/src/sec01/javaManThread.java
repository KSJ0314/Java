package sec01;

public class javaManThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("기상합니다.");
				Thread.sleep(1500);
			} catch (Exception e) {
			}
		}

	}

}
