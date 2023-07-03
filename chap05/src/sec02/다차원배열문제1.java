package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다차원배열문제1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] student = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d번 학생의 이름을 입력하세요. ", i + 1);
			student[i] = br.readLine();
		}
		System.out.println();

		String[] subject = { "중간고사", "기말고사" };
		int[][] num = new int[3][2];
		int[] sum = new int[3];
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length(); j++) {
				System.out.printf("\"%s\"님의 %s 성적을 입력하세요. ", student[i], subject[j]);
				num[i][j] = Integer.parseInt(br.readLine());
				sum[i] += num[i][j];
			}
			System.out.println();
		}

		for (int i = 0; i < student.length; i++) {
			double avg = (double) sum[i] / student[i].length();
			System.out.printf("\"%s\"님의 평균 점수는 %.2f점입니다.\n", student[i], avg);
		}

	}

}
