package sec01;

import java.util.Scanner;

public class ���ǹ�3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("����� �ڵ带 �Է��� �ּ��� ");
		String code = s.next();

		switch (code.charAt(0)) {
			case 'A':
			case 'a':
				System.out.println("�λ�ο� �����Ǽ̽��ϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("��ȹ�ο� �����Ǽ̽��ϴ�.");
				break;
			case 'C':
			case 'c':
				System.out.println("�ѹ��ο� �����Ǽ̽��ϴ�.");
				break;
			default:
				System.out.println("X");
		}

	}
}
