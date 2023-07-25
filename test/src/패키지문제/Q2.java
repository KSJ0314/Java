package 패키지문제;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("게임을 시작합니다.");
		while (true) {
			System.out.print(">>");
			String a = sc.nextLine();
			if (a.equals("그만")) break;
			String[] b = a.split(" ");
			System.out.println("어절 개수는 " + b.length);
		}

	}

}
