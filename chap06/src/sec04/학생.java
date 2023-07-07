package sec04;

public class �л� {
	private String gender; // ����
	private String code; // �а��ڵ�
	private int score; // ����

	public �л�(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	void start() { // �ʵ尪 ���, end()�� ���ϰ�(����)�� ���
		System.out.printf("���� : %s\n�а��ڵ� : %s\n���輺�� : %d\n", gender, code, score);
		System.out.printf("���� : %s\n", end(score));
	}
	
	void start(int[] sc) { // �ʵ尪 ���, end()�� ���ϰ�(����)�� ���
		System.out.printf("���� : %s\n�а��ڵ� : %s\n", gender, code);
		end(sc);
		System.out.printf("���� ��� : %.2f\n", age(sc));
	}

	String end(int score) { // ������ ���� ���� ����
		String grade;
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		return grade;
	}

	void end(int[] score) { // ������ ���� ���� ����
		String grade;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 90) {
				grade = "A";
			} else if (score[i] >= 80) {
				grade = "B";
			} else if (score[i] >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}
			System.out.printf("%d�� ������ ���� : %s\n", i+1, grade);
		}

	}

	double age(int[] arr) {
		double grade = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 90) {
				grade += 4;
			} else if (arr[i] >= 80) {
				grade += 3;
			} else if (arr[i] >= 70) {
				grade += 2;
			} else if (arr[i] >= 60) {
				grade += 1;
			}
		}
		double age = grade / arr.length;
		return age;
	}

}
