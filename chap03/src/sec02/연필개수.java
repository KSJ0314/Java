package sec02;

import java.util.Scanner;

public class ���ʰ��� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�л� ���� �Է����ּ��� : ");
		int student = s.nextInt();
		System.out.print("���� ������ �Է����ּ��� : ");
		int pen = s.nextInt();

		int a = pen / student;
		int b = pen % student;

		System.out.printf("�л� �� ��� %d���� ������ �������� %d���� ���ƿ�\n", a, b);
	}

}
