package sec01;

import java.util.Scanner;

public class StringCharATExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 2; // 인원수

		String[] name = new String[num];	// 입력 이름
		String[] grade = new String[num];	// 입력 성적 코드
		int[] score = new int[num];	// 점수 저장

		for (int i = 0; i < num; i++) {
			System.out.print("이름, 코드 입력 >> ");
			name[i] = sc.next();
			grade[i] = sc.next();

			score[i] = Integer.parseInt(grade[i].substring(1));

			switch (grade[i].charAt(0)) {
				case 'A':
					score[i] *= 1.2;
					break;
				case 'B':
					score[i] *= 1.1;
					break;
				case 'C':
					score[i] *= 1.05;
					break;
			}
//		}
//
//		for (int i = 0; i < num; i++) {		// 결과 즉시 출력 / 바로 출력

			System.out.print(name[i] + "님은 ");
			if (score[i] >= 90) {
				System.out.print("최우수");
			} else if (score[i] >= 80) {
				System.out.print("우수");
			} else {
				System.out.print("일반");
			}
			System.out.println(" 등급입니다.");
		}

	}

}
