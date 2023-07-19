package 惑加楷嚼巩力.Q1;

public class IPTV extends ColorTV {
	
	private String add;
	
	public IPTV(String add, int size, int cost) {
		super(size, cost);
		this.add = add;
	}
	
	public void printProperty() {
		System.out.print("IPTV 林家 : "+add+", ");
		super.printProperty();
	}


}
