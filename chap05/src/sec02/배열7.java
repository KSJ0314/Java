package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �迭7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		int[] scores = { 83, 90, 87 };
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.printf("���� : %d\n", sum);
//
//		double avg = (double) sum / scores.length;
//
//		System.out.printf("��� : %f\n", avg);

		System.out.print("�迭�� ������? ");

		int[] scores = new int[Integer.parseInt(br.readLine())];
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���. ", i + 1);
			scores[i] = Integer.parseInt(br.readLine());
			sum += scores[i];
		}
		double avg = (double) sum / scores.length;

		System.out.printf("�հ� : %d\n��� : %f\n", sum, avg);

	}

}
