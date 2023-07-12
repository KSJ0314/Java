package sec02;

public class Car {
	Tire frontLeftTire = new Tire(6, "앞왼쪽");
	Tire frontRightTire = new Tire(2, "앞오른쪽");
	Tire backLeftTire = new Tire(3, "뒤왼쪽");
	Tire backRightTire = new Tire(4, "뒤오른쪽");

	int run() {
		System.out.println("자동차가 달립니다.");
		boolean frontLeft = frontRightTire.roll();
		boolean frontRight = frontRightTire.roll();
		boolean backLeft = backLeftTire.roll();
		boolean backRight = backRightTire.roll();
		if (!frontLeft) {
			stop();
			return 1;
		} else if (!frontRight) {
			stop();
			return 2;
		} else if (!backLeft) {
			stop();
			return 3;
		} else if (!backRight) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
