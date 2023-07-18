package sec02;

public class Car {
	Tire frontLeftTire = new HankookTire("앞 왼쪽");
	Tire frontRightTire = new HankookTire("앞 오른쪽");
	Tire backLeftTire = new HankookTire("뒤 왼쪽");
	Tire backRightTire = new HankookTire("뒤 오른쪽");
	// Tire 인터페이스로 자동 변환 되었으나
	// 오버라이드된 roll 메소드는 가지고 넘어감

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.run();
		car.frontLeftTire = new KumhoTire("앞 왼쪽");
		car.run();
		
	}
}
