package sec02;

public class PrintThread2 extends Thread {

	@Override
	public void run() {

		int a = 1;
		while (true) {
			System.out.println("������ " + a++);

			if (isInterrupted()) {
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
