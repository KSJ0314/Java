package test;

import java.util.Scanner;

public class �����ձ� {

	Scanner s = new Scanner(System.in);
	int num;
	String[] name;
	String[] text = new String[2];

	public boolean gameOver(int i) {
		if (text[1].charAt(0) != text[0].charAt(text[0].length() - 1)) {
			System.out.println(name[i] + "���� �����ϴ�.");
			return false;
		} else {
			return true;
		}
	}

	public void createPlayer(int num) {
		name = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			name[i] = s.next();
		}
	}

	public void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		num = s.nextInt();
		createPlayer(num);

		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		text[0] = "�ƹ���";

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
		�����ձ� game = new �����ձ�();
		
		game.run();
	}

}
