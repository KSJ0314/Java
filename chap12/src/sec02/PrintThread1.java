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
			System.out.println("������ "+a++);
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	
	
	
}
