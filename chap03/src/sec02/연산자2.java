package sec02;

import java.util.Scanner;

public class ������2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("x�� �ʱⰪ�� �Է����ּ���. : ");
		int x = s.nextInt();

		System.out.print("y�� �ʱⰪ�� �Է����ּ���. : ");
		int y = s.nextInt();

		System.out.print("���� ��ȣ�� �Է����ּ���.(+,-) : ");
		String z = s.next();

		if (z.equals("+")) {
			x++;
		} else if (z.equals("-")) {
			y--;
		}

		System.out.printf("x : %d, y : %d\n", x, y);

	}

}
