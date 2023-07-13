package sec03;

public abstract class Animal {

	public String kind; // 동물 종류

	public void breathe() { // 일반 메소드
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound(); // 추상 메소드, 하위클래스에서 내용 지정(오버라이딩)

}
