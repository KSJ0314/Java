package ��ӿ�������.Q1;

public class ColorTV extends TV {
	
	private int cost;

	public ColorTV(int size, int cost) {
		super(size);
		this.cost = cost;
	}
	
	public void printProperty() {
		System.out.println(getSize() +"��ġ "+ cost + "����");
	}

}
