package test;

import java.util.Scanner;

public class �ݺ�����2 {

	public static boolean whoWin(String u, String c) {
		if (u.equals("�׸�")) {
			System.out.println("������ �����մϴ�.");
			return false;
		}
		System.out.println("��� : " + u + "\n��ǻ�� : " + c);
		if (u.equals(c)) System.out.println("�����ϴ�.");
		else if (u.equals("����") && c.equals("��") || u.equals("����") && c.equals("����")
				|| u.equals("��") && c.equals("����")) System.out.println("����� �̰���ϴ�.");
		else System.out.println("����� �����ϴ�.");
		return true;

	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String[] game = { "����", "����", "��" };
		String user = "", compu = "";

		do {
			System.out.println("���� ���� �� �� �ϳ��� �����ϼ���.");
			System.out.println("�׸��� �Է��ϸ� ������ ����˴ϴ�.");

			user = s.next();
			compu = game[(int) (Math.random() * 3)];

		} while (whoWin(user, compu));

	}
}
