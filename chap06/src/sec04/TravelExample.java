package sec04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TravelExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Travel travel = new Travel();

		travel.setOil(20);
		travel.setLocation("����");

		System.out.printf("���� ������ %s, ���� �ֹ����� %dL�Դϴ�.\n", travel.getLocation(), travel.getOil());

		while (travel.isOil()) {
			System.out.println("\n-------------------------------------------------\n");
			System.out.println("������ �������� �Է��ϼ���. ");
			System.out.print("1.����(-10L) | 2.�λ�(-5L) | 3.����(-3L) | 4.ȭ��(-2L)\n> ");
			String location = br.readLine();
			if (travel.getLocation().equals(location)) {
				System.out.println("���� ������ �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			switch (location) {
				case "1":
				case "����":
					travel.minusOil(10);
					travel.setLocation("����");
					break;
				case "2":
				case "�λ�":
					travel.minusOil(5);
					travel.setLocation("�λ�");
					break;
				case "3":
				case "����":
					travel.minusOil(3);
					travel.setLocation("����");
					break;
				case "4":
				case "ȭ��":
					travel.minusOil(2);
					travel.setLocation("ȭ��");
					break;
				default:
					System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
					continue;
			}
			System.out.printf("%s(��)�� �̵��߽��ϴ�. ���� �ֹ����� %dL�Դϴ�.\n", travel.getLocation(), travel.getOil());
			if (travel.isOil()) {
				System.out.println("�ֹ����� ���Ҿ��. ��� �����ϼ���.");
			} else {
				System.out.println("�ֹ����� �����. ���� �������.");
			}
		}

	}

}
