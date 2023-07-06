package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if예제1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("출전 가수의 이름은 무엇인가요? ");
		String name = br.readLine();
		System.out.print("가수의 평점은 몇 점인가요? ");
		int point = Integer.parseInt(br.readLine());

		String grade;
		if (point >= 8) {
			grade = "최상급";
		} else if (point >= 5) {
			grade = "중급";
		} else {
			grade = "하급";
		}
		
		System.out.printf("%s님의 등급은 %s입니다.\n", name, grade);

	}

}
