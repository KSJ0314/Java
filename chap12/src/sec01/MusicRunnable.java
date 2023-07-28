package sec01;

public class MusicRunnable implements Runnable  {

	@Override
	public void run() {
		for(int i =0; i<3; i++) {
			try {
				Thread.sleep(500);
				System.out.println("음악을 재생합니다.");
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
