package sec01;

public interface RemoteControl {

	// public int s = 3;
	// �ùٸ� ��� ��� x
	// ����ʵ常 ����, �ʵ�� �빮�ڷ� ���

	public int S = 3;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

//	public String NAME;
//	����ʵ�� �ݵ�� �ʱⰪ ����

	public String NAME = "ȫ�浿";

	void turnOn();
	void turnOff();
	public void setVolume(int volume);
	
	

}
