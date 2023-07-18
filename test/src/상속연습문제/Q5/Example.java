package 상속연습문제.Q5;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calc calc;

		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ch = sc.next();

		switch (ch) {
			case "+":
				calc = new Add();
				break;
			case "-":
				calc = new Sub();
				break;
			case "*":
				calc = new Mul();
				break;
			default:
				calc = new Div();
		}
		calc.setValue(a, b);
		System.out.println(calc.calculate());

	}

}
