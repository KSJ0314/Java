package sec01;

import java.util.Scanner;

public class switch연습1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("당신의 이름은? ");
		String name = s.next();

		System.out.print("당신의 학년은? ");
		int grade = s.nextInt();

		switch (grade) {
			case 1:
				System.out.printf("%s 님은 %d학년입니다.\n", name, 1);
				break;
			case 2:
				System.out.printf("%s 님은 %d학년입니다.\n", name, 2);
				break;
			default :
				System.out.printf("%s 님은 %d학년입니다.\n", name, 3);
		}
		
	}

}
