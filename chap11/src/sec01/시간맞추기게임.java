package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class �ð����߱���� {

	private String enter;
	private int time;

	public int start() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine();
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("���� ���� : " + time + "�� �Դϴ�.");
		return time;
	}

	public static void main(String[] args) {
		�ð����߱���� enter = new �ð����߱����();

		String[] name = { "ȫ�浿", "�嵿��" };
		int[] sTime = new int[2];
		int[] resultTime = new int[2];

		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");

		for (int i = 0; i < 2; i++) {
			System.out.print(name[i] + " ���� <Enter>Ű >>");
			sTime[0] = enter.start();
			System.out.print(name[i] + " 10�� ���� �� <Enter>Ű >>");
			sTime[1] = enter.start();
			resultTime[i] = sTime[1] - sTime[0];
			if (sTime[0] > sTime[1]) {
				resultTime[i] += 60;
			}
		}

		System.out.print(name[0] + "�� ��� " + resultTime[0] + ", " + name[1] + "�� ��� " + resultTime[1] + ", ");

		if (Math.abs(10 - resultTime[0]) < Math.abs(10 - resultTime[1])) {
			System.out.println("���ڴ� " + name[0]);
		} else if (Math.abs(10 - resultTime[0]) > Math.abs(10 - resultTime[1])) {
			System.out.println("���ڴ� " + name[1]);
		} else {
			System.out.println("���º�");
		}

	}

}
