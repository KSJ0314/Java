package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
		int a = s.nextInt();

		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		int b = s.nextInt();

		System.out.print("�����ڸ� �Է����ּ���(+,-,*,/) : ");
		String c = s.next();

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int result1 = 0;
		float result2;

		if (c.equals("+")) {
			result1 = a + b;
		} else if (c.equals("-")) {
			result1 = a - b;
		} else if (c.equals("*")) {
			result1 = a * b;
		}
		
		if (c.equals("/")) {
			result2 = (float) a / b;
			System.out.println(result2);
		} else {
			System.out.println(result1);
		}


	}

}
