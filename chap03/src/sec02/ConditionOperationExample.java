package sec02;

import java.util.Scanner;

public class ConditionOperationExample {

	public static void main(String[] args) {

//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		System.out.println(score + "점은 " + grade + "등급입니다.");

		Scanner s = new Scanner(System.in);

		System.out.print("점수를 입력해주세요. ");
		int score = s.nextInt();

		char grade = (score >= 90) ? '수' : ((score >= 80) ? '우' : '미');
		System.out.printf("%d점은 \'%s\'등급입니다.\n", score, grade);

	}

}
