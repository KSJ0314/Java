package sec02;

import java.util.Scanner;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int x = 10;
		int y = 10;
		int z;

		System.out.println("----------------");

		x++;
		++x;
		System.out.println("x=" + x);

		System.out.println("----------------");

		y--;
		--y;
		System.out.println("y=" + y);

		System.out.println("----------------");

		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("----------------");

		z = ++x;
		System.out.println("z=" + x);
		System.out.println("x=" + x);

		System.out.println("----------------");

		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
