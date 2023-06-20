package sec02.exam04;

import java.util.Scanner;

public class 응용문제4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		String name = s.next();

		System.out.println("나이를 입력하세요.");
		int age = s.nextInt();

		String isAdult;

		if (age < 20) {
			isAdult = "청년";
		} else {
			isAdult = "장년";
		}

		System.out.println(name + "님은 " + isAdult + "입니다.");
	}

}
