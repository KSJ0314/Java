package 상속연습문제.Q4;

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("홍길동", "자바");
		dic.put("김길동", "파이썬");
		dic.put("김길동", "C");
		dic.put("이길동", "C");
		dic.put("박길동", "C");
		dic.put("조길동", "C");
		System.out.println("홍길동의 값은 " + dic.get("홍길동"));
		System.out.println("김길동의 값은 " + dic.get("김길동"));
		dic.delete("홍길동");
		System.out.println("홍길동의 값은 " + dic.get("홍길동"));

		System.out.println(dic.length());
		dic.put("최길동", "C");
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(dic.KeyArray[i]);
		}

		System.out.println(dic.length());
	}

}
