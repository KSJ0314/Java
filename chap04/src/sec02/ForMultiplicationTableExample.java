package sec02;

import java.util.Scanner;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("단 수를 입력해주세요. ");
		int n = s.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d * %d\n", n, i, n * i);
		}

	}

}
