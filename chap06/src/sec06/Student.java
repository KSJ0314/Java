package sec06;

import java.util.Scanner;

public class Student {

	Scanner s = new Scanner(System.in);

	private String name = "ȫ�浿"; // �л� �̸�
	private String code = "A123";
	private int middleScore;
	private int finalScore;
	private double avg;

	final String id = "admin";
	final String password = "1234";

	public void checkLogin() {
		while (true) {
			System.out.print("���̵� �Է��ϼ���. ");
			String inputid = s.next();
			System.out.print("��й�ȣ�� �Է��ϼ���. ");
			String inputpass = s.next();

			if (!getId().equals(inputid)) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			} else if (!getPassword().equals(inputpass)) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			} else {
				break;
			}
		}
	}

	public void inputExam() {
		System.out.print("�߰���� ������ �Է��ϼ���. ");
		setMiddleScore(s.nextInt());
		System.out.print("�⸻��� ������ �Է��ϼ���. ");
		setFinalScore(s.nextInt());

		setAvg((double) (getMiddleScore() + getFinalScore()) / 2);
		System.out.printf("%s���� ��� ������ %.2f���Դϴ�.\n", getName(), getAvg());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

}
