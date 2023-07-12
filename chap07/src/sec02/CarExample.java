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
				System.out.println("앞 왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire(15, "앞왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 한국타이어로 교체");
				car.frontRightTire = new HankookTire(13, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 한국타이어로 교체");
				car.backLeftTire = new HankookTire(14, "뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 한국타이어로 교체");
				car.backRightTire = new HankookTire(17, "뒤오른쪽");
				break;
			}
			System.out.println();
		}

	}

}
