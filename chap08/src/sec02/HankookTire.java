package sec02;

public class HankookTire implements Tire {
	
	private String wh;

	public HankookTire(String wh) {
		this.wh = wh;
	}

	public void roll() {
		System.out.println("�ѱ� Ÿ�̾ �������ϴ�. " + wh + "����");
	}

}
