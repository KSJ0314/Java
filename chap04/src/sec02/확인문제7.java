package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ȯ�ι���7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int balance = 0;
		int deposit, withdraw;

		System.out.println("�������࿡ �湮�Ͻ� ���� ȯ���մϴ�.");
		Outter: while (true) {
			System.out.println();
			System.out.println("-----------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------------");
			System.out.print("����> ");
			int choice = Integer.parseInt(br.readLine());

			switch (choice) {
				case 1:
					System.out.print("���ݾ�> ");
					deposit = Integer.parseInt(br.readLine());
					balance += deposit;
					break;
				case 2:
					System.out.print("��ݾ�> ");
					withdraw = Integer.parseInt(br.readLine());
					if (balance > withdraw) {
						balance -= withdraw;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					break;
				case 3:
					System.out.printf("�ܰ�> %d\n", balance);
					break;
				case 4:
					System.out.println("\n���α׷� ����");
					break Outter;
			}

		}

	}

}
