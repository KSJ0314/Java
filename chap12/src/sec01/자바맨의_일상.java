package sec01;

import java.util.Calendar;

public class 자바맨의_일상 {

	public static void printDate(Calendar calendar) {

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);

		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 입니다.");
	}

	public static void main(String[] args) {

		Thread tr1 = new javaManThread();
		Thread tr2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("공부합니다.");
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}

			}
		});

		Thread tr3 = new Thread(new javaManRunnable());
		Calendar cal = Calendar.getInstance();
		

		System.out.println("자바맨의 일상");
		
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
