package sec03;

import java.util.Calendar;

public class ��¥��¿��� {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);

		System.out.printf("%d�� %d�� %d�� %d�� �Դϴ�.\n", year, month, day, hour); 

	}

}
