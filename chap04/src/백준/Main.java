package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();

		char[] S2 = new char[S.length()];
		int[] I = new int[26];

		for (int i = 0; i < S2.length; i++) {
			S2[i] = S.charAt(i);
			if (S2[i] >= 97) {
				S2[i] -= 32;
			}
			S2[i] -= 65;
			I[S2[i]]++;
		}

		int max = 0;
		for (int i = 0; i < I.length; i++) {
			if (max < I[i]) {
				max = I[i];
			}
		}

		char result = '0';
		for (int i = 0; i < I.length; i++) {
			if (I[i] == max) {
				if (result == '0') {
					result = (char) (i + 65);
				} else {
					result = '?';
				}
			}
		}
		System.out.println(result);
	}

}
