package sec01;

import java.util.Scanner;

public class if����1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("����� �̸���? ");
		String name = s.next();

		System.out.print("����� ������? ");
		int score = s.nextInt();

		if (score >= 70) {
			System.out.printf("%s ���� �հ��Դϴ�.\n", name);
		} else {
			System.out.printf("%s ���� ���հ��Դϴ�.\n", name);
		}

		
		
	}

}
