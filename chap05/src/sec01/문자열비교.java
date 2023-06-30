package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열비교 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("두 데이터의 참조가 같아요");
		} else {
			System.out.println("두 데이터의 참조가 달라요");
		}

		String c = new String("홍길동");
		String d ="홍길동";

		if (c == d) {
			System.out.println("두 데이터의 참조가 같아요");
		} else {
			System.out.println("두 데이터의 참조가 달라요");
		}

		String a = br.readLine();
		String b = br.readLine();

		if (a == b) {
			System.out.println("두 데이터의 참조가 같아요");
		} else {
			System.out.println("두 데이터의 참조가 달라요");
		}

	}

}
