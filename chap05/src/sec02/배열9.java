package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배열9 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		int[] lotto = new int[6];
		boolean[] check = new boolean[46];

		System.out.print("몇 게임을 하시겠습니까? ");
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			System.out.printf("\n--------%d회차--------\n ", i + 1);
			for (int j = 0; j < 6; j++) {
				num = (int) (Math.random() * 45) + 1;

				if (check[num] == false) {
					lotto[j] = num;
					check[num] = true;
				} else {
					j--;
					continue;
				}
			}

			for (int j = 1; j <= 45; j++) {
				for (int k = 0; k < lotto.length; k++) {
					if (j == lotto[k]) {
						System.out.printf("%2d ", lotto[k]);
					}
				}
			}

			for (int j = 0; j < check.length; j++) {
				check[j] = false;
			}
		}

	}

}
