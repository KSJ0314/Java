package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if예제2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("출전 가수의 이름은 무엇인가요? ");
		String name = br.readLine();

		char last;
		
//		if (name.length() == 3) {
//			last = name.charAt(2);
//		} else {
//			last = name.charAt(1);
//		}

//		last = (name.length() == 3) ? name.charAt(2) : name.charAt(1);

		last = name.charAt(name.length() - 1);

		System.out.printf("%s님의 마지막글자는 %c입니다.\n", name, last);

	}

}
