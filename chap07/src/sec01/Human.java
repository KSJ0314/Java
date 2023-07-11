package sec01;

public class Human {
	int weight;	// 몸무게
	int height; // 키
	String gender;	// 성별
	
	public Human(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	void sleep() {System.out.println("잠이 듭니다.");}
	void awake() {System.out.println("일어납니다.");}
	
	String eat(String food) {
		return food + "(을)를 먹습니다.";
	}
	
	String run(int speed) {
		return speed + "km/h로 달립니다.";
	}
}
