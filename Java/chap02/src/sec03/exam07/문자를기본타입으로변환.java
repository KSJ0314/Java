package sec03.exam07;

import java.util.Scanner;

public class ���ڸ��⺻Ÿ�����κ�ȯ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է����ּ���. : ");
		String a = s.next();

		System.out.print("�� ��° ���� �Է����ּ���. : ");
		String b = s.next();

		int c = Integer.parseInt(a) + Integer.parseInt(b);

		System.out.println("�� ���� ���� " + c + "�Դϴ�.");

	}

}
