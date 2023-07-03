package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배열7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		int[] scores = { 83, 90, 87 };
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.printf("총합 : %d\n", sum);
//
//		double avg = (double) sum / scores.length;
//
//		System.out.printf("평균 : %f\n", avg);

		System.out.print("배열의 개수는? ");

		int[] scores = new int[Integer.parseInt(br.readLine())];
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요. ", i + 1);
			scores[i] = Integer.parseInt(br.readLine());
			sum += scores[i];
		}
		double avg = (double) sum / scores.length;

		System.out.printf("합계 : %d\n평균 : %f\n", sum, avg);

	}

}
