package Ŭ������������;

import java.util.Scanner;

public class PhoneBook2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�ο����� �Է��ϼ��� : ");
		int num = s.nextInt();
		Phone2[] phone = new Phone2[num];

		for (int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�) : ");
			phone[i] = new Phone2(s.next(), s.next());
		}
		System.out.println("����Ǿ����ϴ�.");

		while (true) {
			System.out.print("�˻��� �̸� : ");
			String inputName = s.next();
			int i;
			if (inputName.equals("����")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			for (i = 0; i < num; i++) {
				if (phone[i].name.equals(inputName)) {
					System.out.println(inputName+"�� ��ȭ��ȣ�� " + phone[i].phoneNum + "�Դϴ�.");
					break;
				}
			}
			if (i == num) {
				System.out.println(inputName + "�� �����ϴ�.");
			}
		}

	}

}
