package sec01;

import java.util.Scanner;

public class IndexOfExample {

	public static void main(String[] args) {

		String str1 = "���� �ڹٸ� ����մϴ�.";

		int index = str1.indexOf("����մϴ�.");
		System.out.println(index);

		Scanner sc = new Scanner(System.in);

		System.out.print("�ּҸ� �Է��ϼ��� >> ");
		String add = sc.nextLine();
		if (add.indexOf("����") != -1 || add.indexOf("�ξ�") != -1 || add.indexOf("���") != -1 || add.indexOf("���") != -1) {
			System.out.println("�ϱ� ���ֹ��Դϴ�.");
		} else {
			System.out.println("�ϱ� ���ֹ��� �ƴմϴ�.");
		}
	}

}
