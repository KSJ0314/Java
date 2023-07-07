package sec04;

public class 학생 {
	private String gender; // 성별
	private String code; // 학과코드
	private int score; // 성적

	public 학생(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	void start() { // 필드값 출력, end()의 리턴값(학점)을 출력
		System.out.printf("성별 : %s\n학과코드 : %s\n시험성적 : %d\n", gender, code, score);
		System.out.printf("학점 : %s\n", end(score));
	}
	
	void start(int[] sc) { // 필드값 출력, end()의 리턴값(학점)을 출력
		System.out.printf("성별 : %s\n학과코드 : %s\n", gender, code);
		end(sc);
		System.out.printf("학점 평균 : %.2f\n", age(sc));
	}

	String end(int score) { // 성적에 따라 학점 리턴
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

	void end(int[] score) { // 성적에 따라 학점 리턴
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
			System.out.printf("%d번 과목의 학점 : %s\n", i+1, grade);
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
