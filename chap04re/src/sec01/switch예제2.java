package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch예제2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학과코드를 입력해주세요. ");
		String code = br.readLine();

		String dept = "?";

		switch (code.charAt(0)) {
			case 'a':
			case 'A':
				dept = "법학";
				break;
			case 'b':
			case 'B':
				dept = "경영학";
				break;
			case 'c':
			case 'C':
				dept = "국문학";
				break;
		}

		System.out.printf("%s과 학생입니다.\n", dept);

	}

}
