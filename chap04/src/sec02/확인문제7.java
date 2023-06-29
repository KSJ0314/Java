package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 확인문제7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int balance = 0;
		int deposit, withdraw;

		System.out.println("광주은행에 방문하신 것을 환영합니다.");
		Outter: while (true) {
			System.out.println();
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int choice = Integer.parseInt(br.readLine());

			switch (choice) {
				case 1:
					System.out.print("예금액> ");
					deposit = Integer.parseInt(br.readLine());
					balance += deposit;
					break;
				case 2:
					System.out.print("출금액> ");
					withdraw = Integer.parseInt(br.readLine());
					if (balance > withdraw) {
						balance -= withdraw;
					} else {
						System.out.println("잔액이 부족합니다.");
					}
					break;
				case 3:
					System.out.printf("잔고> %d\n", balance);
					break;
				case 4:
					System.out.println("\n프로그램 종료");
					break Outter;
			}

		}

	}

}
