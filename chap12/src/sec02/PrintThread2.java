package sec02;

public class PrintThread2 extends Thread {

	@Override
	public void run() {

		int a = 1;
		while (true) {
			System.out.println("실행중 " + a++);

			if (isInterrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
