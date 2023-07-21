package sec02;

public class Anonymous {
	
	Worker worker = new Worker() {

		@Override
		public void start() {
			System.out.println("�������� �մϴ�.");
		}
		
	};
	
	void method1() {
		Worker localworker = new Worker() {

			@Override
			public void start() {
				System.out.println("������ �մϴ�.");
			}
			
		};
		localworker.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}

}
