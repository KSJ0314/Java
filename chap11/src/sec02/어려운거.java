package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class 어려운거 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();

		cal.set(year, month - 1, 1);
		cal2.set(year, month, 1);
		cal2.add(Calendar.DATE, -1);

		int yo = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("\n ========[" + month + "월]========");
		System.out.println("  일  월 화  수 목  금 토");
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
