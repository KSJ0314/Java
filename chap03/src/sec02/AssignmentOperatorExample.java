package sec02;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num1 = 100;
		System.out.print("���ڸ� �Է��ϼ���  : ");
		double a = s.nextInt();
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		String b = s.next();

		if (b.equals("+")) {
			num1 += a;
		} else if (b.equals("-")) {
			num1 -= a;
		} else if (b.equals("*")) {
			num1 *= a;
		} else if (b.equals("/")) {
			num1 /= a;
		} else if (b.equals("%")) {
			num1 %= a;
		}

		System.out.println(a);

	}
}
