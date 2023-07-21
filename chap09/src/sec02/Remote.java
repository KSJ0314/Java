package sec02;

public class Remote {

	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	void method1() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디어를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디어를 끕니다.");
			}

		};

		rc.turnOn();
		rc.turnOff();
	}

	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
