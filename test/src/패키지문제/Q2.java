package ��Ű������;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �����մϴ�.");
		while (true) {
			System.out.print(">>");
			String a = sc.nextLine();
			if (a.equals("�׸�")) break;
			String[] b = a.split(" ");
			System.out.println("���� ������ " + b.length);
		}

	}

}
