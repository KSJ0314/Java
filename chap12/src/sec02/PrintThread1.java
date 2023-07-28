package sec02;

public class PrintThread1 extends Thread {

	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		
		int a = 1;
		while(!stop) {
			System.out.println("실행중 "+a++);
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
	
	
}
