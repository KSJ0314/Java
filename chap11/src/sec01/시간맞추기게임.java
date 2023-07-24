package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class 시간맞추기게임 {

	private String enter;
	private int time;

	public int start() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine();
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("현재 시작 : " + time + "초 입니다.");
		return time;
	}

	public static void main(String[] args) {
		시간맞추기게임 enter = new 시간맞추기게임();

		String[] name = { "홍길동", "장동건" };
		int[] sTime = new int[2];
		int[] resultTime = new int[2];

		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

		for (int i = 0; i < 2; i++) {
			System.out.print(name[i] + " 시작 <Enter>키 >>");
			sTime[0] = enter.start();
			System.out.print(name[i] + " 10초 예상 후 <Enter>키 >>");
			sTime[1] = enter.start();
			resultTime[i] = sTime[1] - sTime[0];
			if (sTime[0] > sTime[1]) {
				resultTime[i] += 60;
			}
		}

		System.out.print(name[0] + "의 결과 " + resultTime[0] + ", " + name[1] + "의 결과 " + resultTime[1] + ", ");

		if (Math.abs(10 - resultTime[0]) < Math.abs(10 - resultTime[1])) {
			System.out.println("승자는 " + name[0]);
		} else if (Math.abs(10 - resultTime[0]) > Math.abs(10 - resultTime[1])) {
			System.out.println("승자는 " + name[1]);
		} else {
			System.out.println("무승부");
		}

	}

}
