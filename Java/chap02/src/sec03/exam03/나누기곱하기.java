package sec03.exam03;

import java.util.Scanner;

public class ��������ϱ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���. : ");
		int a = s.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���. : ");
		int b = s.nextInt();
		
		System.out.print("�����ȣ�� �Է��ϼ���.(*,/) : ");
		String c = s.next();
		//char d = c.charAt(0);
		
		if (c.equals("*")) {
			int e = a*b;
			System.out.println("�Է��Ͻ� ������ ����� " + e + "�Դϴ�.");
		} else {
			float e = (float)a/b;
			System.out.println("�Է��Ͻ� ������ ����� " + e + "�Դϴ�.");
		}
		
	}

}
