package sec01;

public class CarExample {

	public static void main(String[] args) {

		System.out.println("���� ����մϴ�.");

		Thread tr = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 4; i++) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
					System.out.println("���� �ӵ� " + 50 * i + "km");
				}
			}

		});

		tr.start();
		
		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			System.out.print("�ӵ��� �ø��ϴ�. ");
		}
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		System.out.println("���� ����ϴ�.");

	}

}
