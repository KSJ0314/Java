package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ȯ�ι���8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int balance = 0;
		int balance2 = 0;

		System.out.println("���ֽø������� �湮�� ȯ���մϴ�.");
		Outter: while (true) {
			System.out.print("\n�۾��ڵ�� ������ �Է��� �ּ���. ");
			String choice = br.readLine();
			char chchoice = choice.charAt(0);
			
			if (chchoice == 'C') {
				break Outter;
			}
			
			int book = Integer.parseInt(choice.substring(1));

			switch (chchoice) {
				case 'A':
					balance += book;
					break;
				case 'B':
					balance2 += book;
			}
			System.out.printf("%d���� �����մϴ�.\n", book);
		}
		System.out.println("\n�۾��� �����մϴ�.");
		System.out.printf("���� �Ǽ� : %d��\n�ݳ� �Ǽ� : %d��\n", balance, balance2);

	}

}
