package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class ����̿�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		int cost = 0;

		System.out.println("1.ĿƮ(8,000) || 2.�ĸ�(20,000) || 3.����(25,000) || 4.����(60,000)");
		System.out.print("�̸��� �Է��ϼ��� >> ");
		name = sc.next();


		switch (sc.nextInt()) {
		case 1:
			cost = 8000;
			break;
		case 2:
			cost = 20000;
			break;
		case 3:
			cost = 25000;
			break;
		case 4:
			cost = 60000;
			break;
		}

		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.AM_PM) == 0) {
			cost *= 0.7;
		} else if (cal.get(Calendar.HOUR) < 6) {
			cost *= 0.9;
		}
		System.out.println(name + "���� ���� �ݾ��� " + cost + "�� �Դϴ�.");

	}

}
