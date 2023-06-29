package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 브레이크예제2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		do {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		} while (true);
		System.out.println("프로그램 종료");

	}

}
