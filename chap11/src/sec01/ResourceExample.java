package sec01;

public class ResourceExample {

	public static void main(String[] args) {

		Class clazz = Key.class;
		
		String photo1 = clazz.getResource("�����.jpg").getPath();
		String photo2 = clazz.getResource("imges/�����.jpg").getPath();
		
		System.out.println(photo1);
		System.out.println(photo2);
		
	}

}
