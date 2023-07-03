package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 확인문제4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열의 개수를 입력해주세요. ");

		int[] N = new int[Integer.parseInt(br.readLine())];

		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(br.readLine());
		}

		int min = N[0];
		for (int i : N) {
			if (min > i) {
				min = i;
			}
		}
		System.out.printf("min: %d\n", min);

	}

}
