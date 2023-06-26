package sec01;

import java.util.Scanner;

public class SwitchDiceExample5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String num = s.next();

		char room = num.charAt(6);

		switch (room) {
			case 'A':
				System.out.println("시험장소가 201호입니다.");
				break;
			case 'B':
				System.out.println("시험장소가 202호입니다.");
				break;
			case 'C':
				System.out.println("시험장소가 203호입니다.");
				break;
			default:
				System.out.println("다시 입력해주세요.");
		}

	}

}
