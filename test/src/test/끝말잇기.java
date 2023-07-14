package test;

import java.util.Scanner;

public class 끝말잇기 {

	Scanner s = new Scanner(System.in);
	int num;
	String[] name;
	String[] text = new String[2];

	public boolean gameOver(int i) {
		if (text[1].charAt(0) != text[0].charAt(text[0].length() - 1)) {
			System.out.println(name[i] + "님이 졌습니다.");
			return false;
		} else {
			return true;
		}
	}

	public void createPlayer(int num) {
		name = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			name[i] = s.next();
		}
	}

	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		num = s.nextInt();
		createPlayer(num);

		System.out.println("시작하는 단어는 아버지입니다.");
		text[0] = "아버지";

		int whileNum = 0;
		while (true) {
			System.out.print(name[whileNum] + ">>");
			text[1] = s.next();
			gameOver(whileNum);
			text[0] = text[1];
			whileNum++;
			whileNum %= num;
		}
	}

	public static void main(String[] args) {
		끝말잇기 game = new 끝말잇기();
		
		game.run();
	}

}
