package sec04;

public class 학생예제 {

	public static void main(String[] args) {

		학생 st = new 학생("남", "A123", 77);
		st.start();
		System.out.println();
		st.start(new int[] {70,90,80,90,90,90});
	}

}
