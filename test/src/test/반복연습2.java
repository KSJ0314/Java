package test;

import java.util.Scanner;

public class 반복연습2 {

	public static boolean whoWin(String u, String c, String[] arr) {
		if (u.equals("그만")) {
			System.out.println("게임을 종료합니다.");
			return false;
		}
		System.out.println("당신 : " + u + "\n컴퓨터 : " + c);
		if (u.equals(c)) System.out.println("비겼습니다.");
		else if (u.equals(arr[0]) && c.equals(arr[2]) || u.equals(arr[1]) && c.equals(arr[0])
				|| u.equals(arr[2]) && c.equals(arr[1])) System.out.println("당신이 이겼습니다.");
		else System.out.println("당신이 졌습니다.");
		return true;
		}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String[] game = { "가위", "바위", "보" };
		String user = "", compu = "";

		do {
			System.out.println("가위 바위 보 중 하나를 선택하세요.");
			System.out.println("그만을 입력하면 게임이 종료됩니다.");

			user = s.next();
			compu = game[(int) (Math.random() * 3)];

		} while (whoWin(user, compu, game));

	}
}
