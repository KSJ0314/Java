package test;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("[�ʼ� ���� �Է�]");
		
		System.out.print("1. �̸�: ");
		String name = s.next();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String userNum = s.next();
		System.out.print("3. ��ȭ��ȣ: ");
		String tel = s.next();
		
		System.out.printf("\n[�Է��� ����]\n%s\n%s\n%s", name, userNum, tel);
		// System.out.printf("%s�� �ֹι�ȣ�� %s�̰� ����ó�� %s�Դϴ�.", name, userNum, tel);
		
	}

}
