package sec02;

public class KumhoTire implements Tire {
	
	private String wh;

	public KumhoTire(String wh) {
		this.wh = wh;
	}

	public void roll() {
		System.out.println("��ȣ Ÿ�̾ �������ϴ�. " + wh + "����");
	}

}
