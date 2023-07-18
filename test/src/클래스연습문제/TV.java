package 클래스연습문제;

public class TV {
	String company;
	int years;
	int size;

	public TV(String company, int years, int size) {
		this.company = company;
		this.years = years;
		this.size = size;
	}

	public void show() {
		System.out.println(company + "에서 만든 " + years + "년형 " + size + "인치 TV");
	}

}
