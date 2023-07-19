package sec01;

public class Outter {

	String name = "홍길동";
	Nested ne = new Nested();
	
	void reName() {
		System.out.println("Outter의 이름 변경합니다.");
		
	}
	
	void print() {
		System.out.println(this.name);
//		System.out.println(Nested.this.name);
		System.out.println(ne.name);
		System.out.println(Outter.this.name);
	}
	
	class Nested {
		String name = "김길동";
		
		void reName() {
			System.out.println("Nested의 이름 변경 합니다.");
		}
		
		
		void print() {
			System.out.println(this.name);
			System.out.println(Nested.this.name);
			System.out.println(Outter.this.name);
		}
	}
	
}
