package sec01;

import java.util.Scanner;

public class if연습3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = s.nextInt();

		if (score >= 50) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("재시험을 보세요.");
		}

	}

}
