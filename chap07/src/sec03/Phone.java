package sec03;

public abstract class Phone {
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void trunOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	public void trunOff() {
		System.out.println("�� ������ ���ϴ�.");
	}

}
