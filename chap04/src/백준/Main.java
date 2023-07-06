package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		double grade = 0;
		int W = 0;

		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			
			String gar = st.nextToken();
			double D = Double.parseDouble(st.nextToken());
			String S = st.nextToken();

			double D2 = 0.0;
			
			switch (S.charAt(0)) {
				case 'A': D2++;
				case 'B': D2++;
				case 'C': D2++;
				case 'D': D2++;
				case 'F': W += D;
			}

			if (D2 != 0 && S.charAt(1) == '+') {
				D2 += 0.5;
			}
			grade += D * D2;
		}
		grade /= W;
		System.out.println(grade);
	}

}
