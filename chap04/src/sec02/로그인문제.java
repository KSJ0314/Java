package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 로그인문제 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String id = "abc";
		int pass = 1234;

		while (true) {
			System.out.print("아이디를 입력해주세요. ");
			String uid = br.readLine();
			System.out.print("비밀번호를 입력해주세요. ");
			int upass = Integer.parseInt(br.readLine());

			System.out.println("\n----------------------");
			if (!id.equals(uid)) {
				System.out.println(" 아이디가 존재하지 않습니다.");
			} else if (pass != upass) {
				System.out.println("     비밀번호가 달라요.");
			} else {
				System.out.println("       환영합니다.");
				System.out.println("----------------------");
				break;
			}
			System.out.println("----------------------\n");
		}

	}

}
