package sec06;

import java.io.IOException;
import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);

		Car car = new Car();

		while (true) {
			System.out.printf("���� : %s | �ӵ� : %d\n", car.getColor(), car.getSpeed());
			System.out.printf("1. ���󺯰� | 2. �ӵ� ���� | 3. �ߴ�\n> ");
			int num = s.nextInt();
			switch (num) {
				case 1:
					car.setColor();
					break;
				case 2:
					car.setSpeed();
					break;
				case 3:
					System.out.println("�����մϴ�.");
					return;
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			System.out.println("------------------------------");
		}

	}

}
