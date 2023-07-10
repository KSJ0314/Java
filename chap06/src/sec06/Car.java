package sec06;

import java.util.Scanner;

public class Car {

	Scanner s = new Scanner(System.in);

	private String name;
	private String company;
	private String color = "지정안함";
	private int speed = 50;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSpeed() {
		return speed;
	}
	
	public String getColor() {
		return color;
	}

	public void setSpeed() {
		System.out.print("증가(a)/감소(s), 속도값 입력 ex)a20\n> ");
		String upDown = s.next();
		int sp = Integer.parseInt(upDown.substring(1));
		if (upDown.charAt(0) == 'a') {
			speed += sp;
		} else if (upDown.charAt(0) == 's' && speed >= sp) {
			speed -= sp;
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void setColor() {
		System.out.print("색상을 입력해주세요. ");
		color = s.next();
	}

}
