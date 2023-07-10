package sec06;

import java.util.Scanner;

public class Student {

	Scanner s = new Scanner(System.in);

	private String name = "홍길동"; // 학생 이름
	private String code = "A123";
	private int middleScore;
	private int finalScore;
	private double avg;

	final String id = "admin";
	final String password = "1234";

	public void checkLogin() {
		while (true) {
			System.out.print("아이디를 입력하세요. ");
			String inputid = s.next();
			System.out.print("비밀번호를 입력하세요. ");
			String inputpass = s.next();

			if (!getId().equals(inputid)) {
				System.out.println("존재하지 않는 아이디입니다.");
			} else if (!getPassword().equals(inputpass)) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else {
				break;
			}
		}
	}

	public void inputExam() {
		System.out.print("중간고사 성적을 입력하세요. ");
		setMiddleScore(s.nextInt());
		System.out.print("기말고사 성적을 입력하세요. ");
		setFinalScore(s.nextInt());

		setAvg((double) (getMiddleScore() + getFinalScore()) / 2);
		System.out.printf("%s님의 평균 점수는 %.2f점입니다.\n", getName(), getAvg());
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
