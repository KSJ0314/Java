package sec01;

import java.util.Scanner;

public class IndexOfExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("林家甫 涝仿窍技夸 >> ");
		String add = "堡林 堡林 堡林 堡林 堡林 堡林";
		System.out.println("林家 函券 >> " + add.replaceFirst("堡林", "堡林堡开矫"));

	}

}
