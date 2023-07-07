package sec05;

public class Singleton {

	// ½Ì±ÛÅæ ¼±¾ð
	private static Singleton singleton = new Singleton();

	// »ý¼ºÀÚ
	private Singleton() {

	}

	static Singleton getInstance() {
		return singleton;
	}

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("°°Àº °´Ã¼");
		} else {
			System.out.println("´Ù¸¥ °´Ã¼");
		}

	}

}
