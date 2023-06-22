package sec02;

import java.util.Scanner;

public class 연필개수 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("학생 수를 입력해주세요 : ");
		int student = s.nextInt();
		System.out.print("연필 개수를 입력해주세요 : ");
		int pen = s.nextInt();

		int a = pen / student;
		int b = pen % student;

		System.out.printf("학생 한 명당 %d개씩 연필을 가져가고 %d개가 남아요\n", a, b);
	}

}
