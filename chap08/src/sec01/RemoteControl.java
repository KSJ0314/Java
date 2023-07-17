package sec01;

public interface RemoteControl {

	// public int s = 3;
	// 올바른 사용 방법 x
	// 상수필드만 가능, 필드명 대문자로 사용

	public int S = 3;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

//	public String NAME;
//	상수필드는 반드시 초기값 지정

	public String NAME = "홍길동";

	void turnOn();
	void turnOff();
	public void setVolume(int volume);
	
	

}
