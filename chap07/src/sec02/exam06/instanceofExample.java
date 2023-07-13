package sec02.exam06;

public class instanceofExample {

	public static void main(String[] args) {

		Parent parentA = new Child();
		method(parentA);

		Parent parentB = new Parent();
		method(parentB);

	}

	public static void method(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("강제 변환 성공");
		} else {
			System.out.println("강제 변환 실패");
		}
	}

}
