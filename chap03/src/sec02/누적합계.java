package sec02;

import java.util.Scanner;

public class �����հ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ���� �Է����ּ���(1~20) : ");
		int a = s.nextInt();
		System.out.print("�ι�° ���� �Է����ּ���(1~20) : ");
		int b = s.nextInt();

		int result = 0;

		if ((b + a) % 2 == 1) {
			result = (a + b) * (((b - a) / 2 + 1));
		} else {
			result = (a + b) * ((b - a) / 2) + (a + b) / 2;
		}
		System.out.println(result);

		result = 0;
		while (true) {
			result += a++;
			if (a > b) {
				break;
			}
		}
		System.out.println(result);

	}

}
