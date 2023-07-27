package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());

		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + "가 출력한 내용");
				System.out.println(this.getName() + "가 출력한 내용");
			}
		};
		threadA.setName("ThreadA");
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();

		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + "가 출력한 내용");
				System.out.println(this.getName() + "가 출력한 내용");
			}
		};
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();

	}

}
