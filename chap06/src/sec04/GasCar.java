package sec04;

public class GasCar{

	int gas;

	void setGas(int gas) {
		this.gas = gas;
		System.out.printf("gas�� %d��ŭ �����Ǿ����ϴ�.\n", this.gas);
	}

	boolean isLeftGase() {
		if (gas > 0) {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		} else {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
	}

	void run() throws InterruptedException {
		while (true) {
			if (gas > 0) {
				System.out.printf("�޸��ϴ�.(gas�ܷ�:%d)\n", gas);
				gas--;
				Thread.sleep(500);
			} else {
				System.out.printf("����ϴ�.(gas�ܷ�:%d)\n", gas);
				Thread.sleep(500);
				return;
			}
		}
	}

}
