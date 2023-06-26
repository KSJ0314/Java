package sec01;

import java.util.Scanner;

public class if연습1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("당신의 이름은? ");
		String name = s.next();

		System.out.print("당신의 점수는? ");
		int score = s.nextInt();

		if (score >= 70) {
			System.out.printf("%s 님은 합격입니다.\n", name);
		} else {
			System.out.printf("%s 님은 불합격입니다.\n", name);
		}

		
		
	}

}
