package Ŭ������������;

public class TV {
	private String company;
	private int years;
	private int size;

	public TV(String company, int years, int size) {
		this.company = company;
		this.years = years;
		this.size = size;
	}

	public void show() {
		System.out.println(company + "���� ���� " + years + "���� " + size + "��ġ TV");
	}

}
