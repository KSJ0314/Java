package sec02;

import java.util.Scanner;

public class while����2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("ó�� �� : ");
		int first = s.nextInt();
		System.out.print("������ �� : ");
		int num = s.nextInt();
		
		int i = first;
		int sum = 0;

		while (i <= num) {
			sum += i;
			i++;
		}

		System.out.printf("%d~%d �� : %d", first, num, sum);

	}

}
