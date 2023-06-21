package test;

import java.util.Scanner;

public class È®ÀÎ¹®Á¦2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Ã¹ ¹øÂ° ¼ö: ");
		String strNum1 = s.next();

		System.out.print("µÎ ¹øÂ° ¼ö: ");
		String strNum2 = s.next();

		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result;

		if (num1 > num2) {
			result = num1 - num2;
			System.out.printf("»¬¼À °á°ú : %d\n", result);
		} else {
			result = num1 + num2;
			System.out.printf("µ¡¼À °á°ú : %d\n", result);
		}
	}

}
