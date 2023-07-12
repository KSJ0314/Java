package sec02;

public class Car {
	Tire frontLeftTire = new Tire(6, "�տ���");
	Tire frontRightTire = new Tire(2, "�տ�����");
	Tire backLeftTire = new Tire(3, "�ڿ���");
	Tire backRightTire = new Tire(4, "�ڿ�����");

	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
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
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
