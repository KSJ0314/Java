package ��Ű������;

import java.util.Calendar;

public class Q1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		int nowHour = cal.get(Calendar.HOUR_OF_DAY);
		int nowMinute = cal.get(Calendar.MINUTE);
		
		System.out.println("���� �ð��� "+nowHour + "�� " + nowMinute+"���Դϴ�.");
		if (nowHour >=4 && nowHour < 12) {
			System.out.println("Good Morning");
		} else if (nowHour < 18) {
			System.out.println("Good Afternoon");
		} else if (nowHour < 22) {
			System.out.println("Good Evening");
		} else {
			System.out.println("Good Night");
		}

	}

}
