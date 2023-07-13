package sec03;

public class Dog extends Animal {

	public Dog(String kind) {
		this.kind = kind;
	}

	@Override
	public void sound() {
		System.out.println("°­¾ÆÁö´Â ¸Û¸Û");
	}

}
