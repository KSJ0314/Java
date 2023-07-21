package sec02;

public class Remote {

	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};

	void method1() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("���� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("���� ���ϴ�.");
			}

		};

		rc.turnOn();
		rc.turnOff();
	}

	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
