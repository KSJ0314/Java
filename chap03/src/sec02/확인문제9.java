package sec02;

import java.util.Scanner;

public class Ȯ�ι���9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		String strnum1 = s.next();
		System.out.print("�� ��° ��: ");
		String strnum2 = s.next();
		
		System.out.println("--------------------");
		
		double num1 = Double.parseDouble(strnum1);
		double num2 = Double.parseDouble(strnum2);
		
		String result = (num2 != 0.0) ? String.valueOf(num1/num2) : "���Ѵ�";
		
		System.out.printf("���:%s", result);
		
		
	}

}
