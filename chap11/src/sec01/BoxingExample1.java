package sec01;

public class BoxingExample1 {

	public static void main(String[] args) {

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		Integer obj4 = new Integer(100);
		Integer obj5 = new Integer(100);
		
		System.out.println(obj4==obj5);
		
		
		int value4 = Integer.parseInt("300");
		System.out.println(value4);
		
	}

}
