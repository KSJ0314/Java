package sec02;

import java.util.Scanner;

public class ConditionOperationExample {

	public static void main(String[] args) {

//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		System.out.println(score + "���� " + grade + "����Դϴ�.");

		Scanner s = new Scanner(System.in);

		System.out.print("������ �Է����ּ���. ");
		int score = s.nextInt();

		char grade = (score >= 90) ? '��' : ((score >= 80) ? '��' : '��');
		System.out.printf("%d���� \'%s\'����Դϴ�.\n", score, grade);

	}

}
