package sec01;

import java.util.Scanner;

public class switch����1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("����� �̸���? ");
		String name = s.next();

		System.out.print("����� �г���? ");
		int grade = s.nextInt();

		switch (grade) {
			case 1:
				System.out.printf("%s ���� %d�г��Դϴ�.\n", name, 1);
				break;
			case 2:
				System.out.printf("%s ���� %d�г��Դϴ�.\n", name, 2);
				break;
			default :
				System.out.printf("%s ���� %d�г��Դϴ�.\n", name, 3);
		}
		
	}

}
