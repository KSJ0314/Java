package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배열4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열의 크기를 입력하세요. ");
		int N = Integer.parseInt(br.readLine());

		int[] intArr = new int[N];
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			intArr[i] = i + 1;
			sum += intArr[i];
		}
		
		double avg = (double) sum / N;
		
		System.out.printf("평균 : %.1f", avg);

	}

}
