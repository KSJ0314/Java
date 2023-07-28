package sec02;

public class ATM implements Runnable {

	private int money = 10000;

	public int getMoney() {
		return money;
	}

	@Override
	public void run() {
		while (true ) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
			}
			if (moneyOut(1000)) {
				break;
			}
		}
	}

	public synchronized boolean moneyOut(int money) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
		}
		if (this.money - money >= 0) {
			this.money -= money;
			System.out.printf(Thread.currentThread().getName() + ", ÀÜ¾× : %,d¿ø \n", this.money);
			return false;
		} else {
			System.out.println(Thread.currentThread().getName() + ", ÀÜ¾×ºÎÁ·");
			return true;
		}
	}
}
