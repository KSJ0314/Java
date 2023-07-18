package 상속연습문제.Q4;

public abstract class PairMap {
	protected String KeyArray[];
	protected String valueArray[];
	
	abstract String get(String key);
	abstract void put(String ket, String value);
	abstract String delete(String key);
	abstract int length();
}
