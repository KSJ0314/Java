package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] game = { "����", "����", "��" };
		String user = "", compu = "";

		do {
			System.out.println("���� ���� �� �� �ϳ��� �����ϼ���.");
			System.out.println("�׸��� �Է��ϸ� ������ ����˴ϴ�.");

			user = br.readLine();
			compu = game[(int) (Math.random() * 3)];

		} while (whoWin(user, compu));

	}
}
