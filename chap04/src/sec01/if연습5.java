package sec01;

import java.util.Scanner;

public class if연습5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = s.nextInt();

		System.out.print("수학 : ");
		int math = s.nextInt();

		System.out.print("영어 : ");
		int eng = s.nextInt();

		int sum = kor + math + eng;

		if (kor > 6 && math > 6 && eng > 6 && sum >= 30) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		if (kor <= 6 || math <= 6 || eng <= 6) {
			System.out.println("불합격입니다.");
			if (sum >= 30) {
				System.out.println("합격입니다.");
			}
		}

	}

}
