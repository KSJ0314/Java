package sec02;

import java.util.Scanner;

public class �����ӱ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�ٷνð��� �Է����ּ��� : ");
		int time = s.nextInt();
		int money = (int) ((time >= 10) ? 9620 * 1.2 * time : 9620 * time);
		System.out.printf("�� �ӱ��� %d�� �Դϴ�.", money);

	}

}
