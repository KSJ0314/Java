package sec02;

public class KumhoTire implements Tire {
	
	private String wh;

	public KumhoTire(String wh) {
		this.wh = wh;
	}

	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다. " + wh + "바퀴");
	}

}
