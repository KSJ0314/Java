package sec02;

import java.util.Scanner;

public class Grade {

	private int math;
	private int science;
	private int english;

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public int getEnglish() {
		return english;
	}

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public double average() {
		double math = getMath();
		double science = getScience();
		double english = getEnglish();
		return (math + science + english) / 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();

		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
	}

}
