package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배열5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] weather = new String[4];

		weather[0] = "봄";
		weather[1] = "여름";
		weather[2] = "가을";
		weather[3] = "겨울";

		System.out.println("좋아하는 계절을 입력하세요. ");
		a: while (true) {
			System.out.println("1.봄 | 2.여름 | 3.가을 | 4.겨울");
			int N = Integer.parseInt(br.readLine());
			
			if (N>=1 && N<=4) {
				System.out.printf("\"%s\"을 선택하셨습니다.", weather[N - 1]);
				break;
			}
			
//			switch (N) {
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//				System.out.printf("\"%s\"을 선택하셨습니다.", weather[N - 1]);
//				break a;
//			}
			
			System.out.println("다시 선택하세요.");
		}

	}

}
