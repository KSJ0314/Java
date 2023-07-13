package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 반복연습1 {

	static boolean win() {
		while (true) {
			char[] game = { '도', '개', '걸', '윷', '모' };
			int computerTurn = (int) (Math.random() * 5);
			int userTurn = (int) (Math.random() * 5);
			System.out.printf("컴퓨터 : %c\n나 : %c\n", game[computerTurn], game[userTurn]);
			if (computerTurn < userTurn) {
				return true;
			} else if (computerTurn > userTurn) {
				return false;
			} else {
				System.out.println("비겼습니다. 다시 뽑습니다.");
			}
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("윷놀이 게임을 시작합니다.");
			System.out.println("1. 게임진행 | 2. 게임 종료");

			if (Integer.parseInt(br.readLine()) == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}

			if (win()) {
				System.out.println("당신이 이겼습니다.");
			} else {
				System.out.println("컴퓨터가 이겼습니다.");
			}

		}

	}

}




