package sec03;

public class Cat extends Animal {

	public Cat(String kind) {
		this.kind = kind;
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹");
	}

}
