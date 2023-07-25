package sec01;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class clazz1 = Key.class;
		System.out.println(clazz1);
		
		Class clazz2 = Class.forName("sec01.Key");
		System.out.println(clazz2);
		
		Key key = new Key();
		Class clazz3 = key.getClass();
		System.out.println(clazz3.getName());
		
		Class clazz4 = Member.class;
		System.out.println(clazz4.getSimpleName());
		
	}

}
