package sec02;

import java.util.Scanner;

public class 확인문제9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String strnum1 = s.next();
		System.out.print("두 번째 수: ");
		String strnum2 = s.next();
		
		System.out.println("--------------------");
		
		double num1 = Double.parseDouble(strnum1);
		double num2 = Double.parseDouble(strnum2);
		
		String result = (num2 != 0.0) ? String.valueOf(num1/num2) : "무한대";
		
		System.out.printf("결과:%s", result);
		
		
	}

}
