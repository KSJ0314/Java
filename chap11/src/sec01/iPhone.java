package sec01;

public class iPhone {
	private String company;
	private int cost;
	private String name;

	public iPhone(String company, int cost, String name) {
		this.company = company;
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		return company + "�� �ֽ����� " + name + " ������ " + cost + "�Դϴ�.";
	}

}
