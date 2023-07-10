package sec06;

import java.io.IOException;
import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);

		Car car = new Car();

		while (true) {
			System.out.printf("색상 : %s | 속도 : %d\n", car.getColor(), car.getSpeed());
			System.out.printf("1. 색상변경 | 2. 속도 변경 | 3. 중단\n> ");
			int num = s.nextInt();
			switch (num) {
				case 1:
					car.setColor();
					break;
				case 2:
					car.setSpeed();
					break;
				case 3:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("잘못입력하셨습니다.");
			}
			System.out.println("------------------------------");
		}

	}

}
