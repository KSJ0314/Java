package sec02;

import java.util.Scanner;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�� ���� �Է����ּ���. ");
		int n = s.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d * %d\n", n, i, n * i);
		}

	}

}
