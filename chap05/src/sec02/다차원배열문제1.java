package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �������迭����1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] student = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d�� �л��� �̸��� �Է��ϼ���. ", i + 1);
			student[i] = br.readLine();
		}
		System.out.println();

		String[] subject = { "�߰����", "�⸻���" };
		int[][] num = new int[3][2];
		int[] sum = new int[3];
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length(); j++) {
				System.out.printf("\"%s\"���� %s ������ �Է��ϼ���. ", student[i], subject[j]);
				num[i][j] = Integer.parseInt(br.readLine());
				sum[i] += num[i][j];
			}
			System.out.println();
		}

		for (int i = 0; i < student.length; i++) {
			double avg = (double) sum[i] / student[i].length();
			System.out.printf("\"%s\"���� ��� ������ %.2f���Դϴ�.\n", student[i], avg);
		}

	}

}
