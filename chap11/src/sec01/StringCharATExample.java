package sec01;

import java.util.Scanner;

public class StringCharATExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 2; // �ο���

		String[] name = new String[num];	// �Է� �̸�
		String[] grade = new String[num];	// �Է� ���� �ڵ�
		int[] score = new int[num];	// ���� ����

		for (int i = 0; i < num; i++) {
			System.out.print("�̸�, �ڵ� �Է� >> ");
			name[i] = sc.next();
			grade[i] = sc.next();

			score[i] = Integer.parseInt(grade[i].substring(1));

			switch (grade[i].charAt(0)) {
				case 'A':
					score[i] *= 1.2;
					break;
				case 'B':
					score[i] *= 1.1;
					break;
				case 'C':
					score[i] *= 1.05;
					break;
			}
//		}
//
//		for (int i = 0; i < num; i++) {		// ��� ��� ��� / �ٷ� ���

			System.out.print(name[i] + "���� ");
			if (score[i] >= 90) {
				System.out.print("�ֿ��");
			} else if (score[i] >= 80) {
				System.out.print("���");
			} else {
				System.out.print("�Ϲ�");
			}
			System.out.println(" ����Դϴ�.");
		}

	}

}
