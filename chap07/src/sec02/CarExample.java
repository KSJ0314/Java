package sec02;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();

//		while (car.run() == 0) {
//
//		}

		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire(15, "�տ���");
				break;
			case 2:
				System.out.println("�� ������ �ѱ�Ÿ�̾�� ��ü");
				car.frontRightTire = new HankookTire(13, "�տ�����");
				break;
			case 3:
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.backLeftTire = new HankookTire(14, "�ڿ���");
				break;
			case 4:
				System.out.println("�� ������ �ѱ�Ÿ�̾�� ��ü");
				car.backRightTire = new HankookTire(17, "�ڿ�����");
				break;
			}
			System.out.println();
		}

	}

}
