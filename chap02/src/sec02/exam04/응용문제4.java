package sec02.exam04;

import java.util.Scanner;

public class ���빮��4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ���.");
		String name = s.next();

		System.out.println("���̸� �Է��ϼ���.");
		int age = s.nextInt();

		String isAdult;

		if (age < 20) {
			isAdult = "û��";
		} else {
			isAdult = "���";
		}

		System.out.println(name + "���� " + isAdult + "�Դϴ�.");
	}

}
