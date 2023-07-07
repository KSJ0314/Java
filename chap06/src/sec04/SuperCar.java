package sec04;

public class SuperCar {

	private int speed;

	public int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() throws InterruptedException {
		Thread.sleep(500);
		for (int i = 1; i <= 5; i++) {
			speed = i * 10;
			System.out.printf("달립니다.(시속 : %dkm/h)\n", speed);
			Thread.sleep(500);
		}
	}

}
