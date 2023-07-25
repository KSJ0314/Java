package sec01;

public class ResourceExample {

	public static void main(String[] args) {

		Class clazz = Key.class;
		
		String photo1 = clazz.getResource("고양이.jpg").getPath();
		String photo2 = clazz.getResource("imges/고양이.jpg").getPath();
		
		System.out.println(photo1);
		System.out.println(photo2);
		
	}

}
