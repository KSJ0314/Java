package sec01;

public class Outter {

	String name = "ȫ�浿";
	Nested ne = new Nested();
	
	void reName() {
		System.out.println("Outter�� �̸� �����մϴ�.");
		
	}
	
	void print() {
		System.out.println(this.name);
//		System.out.println(Nested.this.name);
		System.out.println(ne.name);
		System.out.println(Outter.this.name);
	}
	
	class Nested {
		String name = "��浿";
		
		void reName() {
			System.out.println("Nested�� �̸� ���� �մϴ�.");
		}
		
		
		void print() {
			System.out.println(this.name);
			System.out.println(Nested.this.name);
			System.out.println(Outter.this.name);
		}
	}
	
}
