package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ݺ�����1 {

	static boolean win() {
		while (true) {
			char[] game = { '��', '��', '��', '��', '��' };
			int computerTurn = (int) (Math.random() * 5);
			int userTurn = (int) (Math.random() * 5);
			System.out.printf("��ǻ�� : %c\n�� : %c\n", game[computerTurn], game[userTurn]);
			if (computerTurn < userTurn) {
				return true;
			} else if (computerTurn > userTurn) {
				return false;
			} else {
				System.out.println("�����ϴ�. �ٽ� �̽��ϴ�.");
			}
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("������ ������ �����մϴ�.");
			System.out.println("1. �������� | 2. ���� ����");

			if (Integer.parseInt(br.readLine()) == 2) {
				System.out.println("������ �����մϴ�.");
				break;
			}

			if (win()) {
				System.out.println("����� �̰���ϴ�.");
			} else {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}

		}

	}

}




