package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("����б��� �Է��ϼ��� : ");
		String a = s.next();
		char b = a.charAt(2);

		System.out.print("���� ���г� �ΰ���? : ");
		int c = s.nextInt();

		if (b == '��') {
			System.out.print("����� ���б� ");
		} else {
			System.out.print("����� ����б� ");
		}
		System.out.println(c + "�г��Դϴ�.");

	}

}
