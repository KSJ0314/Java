package ��ӿ�������.Q1;

public class IPTV extends ColorTV {
	
	String add;
	
	public IPTV(String add, int size, int cost) {
		super(size, cost);
		this.add = add;
	}
	
	public void printProperty() {
		System.out.println("IPTV �ּ� : "+add+", " +getSize()+"��ġ "+ cost + "����");
	}


}
