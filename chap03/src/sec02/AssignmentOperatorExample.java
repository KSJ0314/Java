package sec02;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num1 = 100;
		System.out.print("숫자를 입력하세요  : ");
		double a = s.nextInt();
		System.out.print("연산자를 입력하세요 : ");
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
