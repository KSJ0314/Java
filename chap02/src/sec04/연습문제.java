package sec04;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. : ");
		String name = s.next();
		
		System.out.print("나이를 입력하세요. : ");
		int age = s.nextInt();
		
		System.out.println("순번 \t 이름\t  나이");
		System.out.printf("%-3d\t%s\t%4d\n", 1, name, age);
		
		
	}

}
