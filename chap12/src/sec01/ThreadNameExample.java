package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());

		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + "�� ����� ����");
				System.out.println(this.getName() + "�� ����� ����");
			}
		};
		threadA.setName("ThreadA");
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();

		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + "�� ����� ����");
				System.out.println(this.getName() + "�� ����� ����");
			}
		};
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();

	}

}
