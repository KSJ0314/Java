package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ȯ�ι���6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------");
			System.out.print("����> ");
			int selectNo = Integer.parseInt(br.readLine());

			switch (selectNo) {
				case 1:
					System.out.print("�л���> ");
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
					System.out.printf("�ְ� ����: %d\n��� ����: %f\n", max, avg);
					break;
				case 5:
					System.out.println("���α׷� ����");
					run = false;
					break;
			}
		}

	}

}
