package sec01;

import java.util.Calendar;

public class �ڹٸ���_�ϻ� {

	public static void printDate(Calendar calendar) {

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);

		System.out.println("������ " + year + "�� " + month + "�� " + date + "�� �Դϴ�.");
	}

	public static void main(String[] args) {

		Thread tr1 = new javaManThread();
		Thread tr2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("�����մϴ�.");
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}

			}
		});

		Thread tr3 = new Thread(new javaManRunnable());
		Calendar cal = Calendar.getInstance();
		

		System.out.println("�ڹٸ��� �ϻ�");
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		for (int i = 0; i < 5; i++) {
			try {
				printDate(cal);
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			cal.add(Calendar.DATE, 1);
		}

	}

}
