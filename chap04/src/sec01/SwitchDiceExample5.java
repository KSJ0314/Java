package sec01;

import java.util.Scanner;

public class SwitchDiceExample5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String num = s.next();

		char room = num.charAt(6);

		switch (room) {
			case 'A':
				System.out.println("������Ұ� 201ȣ�Դϴ�.");
				break;
			case 'B':
				System.out.println("������Ұ� 202ȣ�Դϴ�.");
				break;
			case 'C':
				System.out.println("������Ұ� 203ȣ�Դϴ�.");
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
		}

	}

}
