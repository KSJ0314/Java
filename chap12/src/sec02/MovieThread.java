package sec02;

public class MovieThread extends Thread {


	@Override
	public void run() {
		
		while(true) {
			System.out.println("동영상을 재생합니다. ");
			if (isInterrupted()) {
				System.out.println("동영상 종료");
				break;
			}
		}
	}
	
	
	
}
