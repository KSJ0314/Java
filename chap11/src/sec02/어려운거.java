package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		System.out.println("������ �Է��ϼ���.");
		int year = sc.nextInt();
		System.out.println("���� �Է��ϼ���.");
		int month = sc.nextInt();

		cal.set(year, month - 1, 1);
		cal2.set(year, month, 1);
		cal2.add(Calendar.DATE, -1);

		int yo = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("\n ========[" + month + "��]========");
		System.out.println("  ��  �� ȭ  �� ��  �� ��");
		for (int i = 1; i < yo; i++) {
			System.out.print("   ");
		}
		
		for (int i = 1; i<=cal2.get(Calendar.DATE); i++) {
			System.out.printf("%3d", i);
			if (yo++ % 7 == 0) {
				System.out.println();
			}
		}

	}

}
