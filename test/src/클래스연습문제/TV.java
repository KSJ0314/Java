package Ŭ������������;

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
		System.out.println(company + "���� ���� " + years + "���� " + size + "��ġ TV");
	}

}
