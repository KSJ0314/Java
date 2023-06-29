package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 확인문제8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int balance = 0;
		int balance2 = 0;

		System.out.println("광주시립도서관 방문을 환영합니다.");
		Outter: while (true) {
			System.out.print("\n작업코드와 개수를 입력해 주세요. ");
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
			System.out.printf("%d권을 대출합니다.\n", book);
		}
		System.out.println("\n작업을 종료합니다.");
		System.out.printf("대출 권수 : %d권\n반납 권수 : %d권\n", balance, balance2);

	}

}
