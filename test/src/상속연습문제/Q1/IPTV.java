package 상속연습문제.Q1;

public class IPTV extends ColorTV {
	
	String add;
	
	public IPTV(String add, int size, int cost) {
		super(size, cost);
		this.add = add;
	}
	
	public void printProperty() {
		System.out.println("IPTV 주소 : "+add+", " +getSize()+"인치 "+ cost + "만원");
	}


}
