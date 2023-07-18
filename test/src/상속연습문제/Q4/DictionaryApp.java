package »ó¼Ó¿¬½À¹®Á¦.Q4;

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("È«±æµ¿", "ÀÚ¹Ù");
		dic.put("±è±æµ¿", "ÆÄÀÌ½ã");
		dic.put("±è±æµ¿", "C");
		System.out.println("È«±æµ¿ÀÇ °ªÀº "+dic.get("È«±æµ¿"));
		System.out.println("±è±æµ¿ÀÇ °ªÀº "+dic.get("±è±æµ¿"));
		dic.delete("È«±æµ¿");
		System.out.println("È«±æµ¿ÀÇ °ªÀº "+dic.get("È«±æµ¿"));
		
	}

}
