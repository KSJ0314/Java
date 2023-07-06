package sec04;

public class GasCar{

	int gas;

	void setGas(int gas) {
		this.gas = gas;
		System.out.printf("gas가 %d만큼 충전되었습니다.\n", this.gas);
	}

	boolean isLeftGase() {
		if (gas > 0) {
			System.out.println("gas가 있습니다.");
			return true;
		} else {
			System.out.println("gas가 없습니다.");
			return false;
		}
	}

	void run() throws InterruptedException {
		while (true) {
			if (gas > 0) {
				System.out.printf("달립니다.(gas잔량:%d)\n", gas);
				gas--;
				Thread.sleep(500);
			} else {
				System.out.printf("멈춥니다.(gas잔량:%d)\n", gas);
				Thread.sleep(500);
				return;
			}
		}
	}

}
