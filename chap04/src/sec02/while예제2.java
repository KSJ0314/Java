package sec02;

import java.util.Scanner;

public class while예제2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("처음 값 : ");
		int first = s.nextInt();
		System.out.print("마지막 값 : ");
		int num = s.nextInt();
		
		int i = first;
		int sum = 0;

		while (i <= num) {
			sum += i;
			i++;
		}

		System.out.printf("%d~%d 합 : %d", first, num, sum);

	}

}
