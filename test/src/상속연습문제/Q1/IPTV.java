package 상속연습문제.Q1;

public class IPTV extends ColorTV {
	
	private String add;
	
	public IPTV(String add, int size, int cost) {
		super(size, cost);
		this.add = add;
	}
	
	public void printProperty() {
		System.out.print("IPTV 주소 : "+add+", ");
		super.printProperty();
	}


}
