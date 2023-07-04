package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배열8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[45];
		for (int i = 0; i < 45; i++) {
			num[i] = i + 1;
		}


		System.out.print("몇 게임을 하시겠습니까? ");
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			System.out.printf("\n--------%d회차--------\n ", i + 1);
			for (int j = 0; j < 45; j++) {
				int a = (int) (Math.random() * 45);
				int temp = num[j];
				num[j] = num[a];
				num[a] = temp;
			}
			for (int j = 0; j < 6; j++) {
				System.out.printf("%2d ", num[j]);
			}
		}

	}

}
