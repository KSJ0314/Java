package sec01;

import java.util.Scanner;

public class ���ǹ�4 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("���� �ڵ带 �Է��� �ּ��� ");
		String code = s.next();

		char part = code.charAt(0);
		String position = code.substring(1, 3);

		String a;
		switch (part) {
			case 'A':
			case 'a':
				a = "�λ��";
				break;
			case 'B':
			case 'b':
				a = "��ȹ��";
				break;
			default:
				a = "�ѹ���";
		}
		
		String money;
		switch (position) {
			case "����":
				money = "1,000,000";
				break;
			case "����":
				money = "700,000";
				break;
			case "����":
				money = "500,000";
				break;
			default:
				money = "0";
		}

		System.out.printf("%s %s�� ���ʽ��ݾ��� %s���Դϴ�.", a, position, money);

	}
}
