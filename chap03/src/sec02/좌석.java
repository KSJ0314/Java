package sec02;

import java.util.Scanner;

public class 좌석 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("학생 수를 입력해주세요 : ");
		int student = s.nextInt();
		System.out.print("한 줄에 몇명씩 앉나요? : ");
		int line = s.nextInt();

		int a = student / line;
		int b = student % line;

//		int result = (b == 0) ? a : a + 1;
//		int result2 = (b == 0) ? b : line - b;
//		System.out.printf("총 %d줄이고 남은 좌석수는 %d개 입니다.\n", result, result2);

		if (b != 0) {
			a++;
			b = line - b;
		}		
		System.out.printf("총 %d줄이고 남은 좌석수는 %d개 입니다.\n", a, b);
	}

}
