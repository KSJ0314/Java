package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 확인문제6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(br.readLine());

			switch (selectNo) {
				case 1:
					System.out.print("학생수> ");
					studentNum = Integer.parseInt(br.readLine());
					scores = new int[studentNum];
					break;
				case 2:
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d]> ", i);
						scores[i] = Integer.parseInt(br.readLine());
					}
					break;
				case 3:
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d]> %d\n", i, scores[i]);
					}
					break;
				case 4:
					int sum = 0;
					int max = 0;
					for (int i : scores) {
						sum += i;
						if (max < i) {
							max = i;
						}
					}
					double avg = (double) sum / scores.length;
					System.out.printf("최고 점수: %d\n평균 점수: %f\n", max, avg);
					break;
				case 5:
					System.out.println("프로그램 종료");
					run = false;
					break;
			}
		}

	}

}
