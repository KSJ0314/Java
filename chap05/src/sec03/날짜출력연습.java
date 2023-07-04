package sec03;

import java.util.Calendar;

public class 날짜출력연습 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);

		System.out.printf("%d년 %d월 %d일 %d시 입니다.\n", year, month, day, hour); 

	}

}
