package sec02;

public class HankookTire implements Tire {
	
	private String wh;

	public HankookTire(String wh) {
		this.wh = wh;
	}

	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다. " + wh + "바퀴");
	}

}
