package sec01;

import java.util.Scanner;

public class ����켱���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ���ڸ� �Է��ϼ���. : ");
		int num1 = s.nextInt();

		System.out.print("�ι�° ���ڸ� �Է��ϼ���. : ");
		int num2 = s.nextInt();

		int sum = num1 + num2;

//		String isPass = (sum >= 50) ? "���" : "Ż��";
//		System.out.println(isPass);

		System.out.println((sum >= 50) ? "���" : "Ż��");

	}

}
