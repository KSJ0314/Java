package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class while예제3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int ran = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.print("숫자 하나를 입력하세요.(1~20) : ");
			int userNum = Integer.parseInt(br.readLine());
			if (userNum == ran) {
				System.out.println("정답입니다.");
				break;
			} else if (userNum > ran) {
				System.out.println("Down");
			} else {
				System.out.println("Up");
			}
			System.out.println();
			
		}
	}

}
