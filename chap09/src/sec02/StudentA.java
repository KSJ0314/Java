package sec02;

public class StudentA {

	String h = "h";

	Person person = new Person() {

		void work() {
			System.out.println("학교를 갑니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	};

	class StudentB {
		String name;
		int age;

		void sleep() {
			System.out.println("잠을 잡니다.");
		}
	}

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				super.wake();
				walk();
			}
		};

		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

	public static void main(String[] args) {
		StudentA stA = new StudentA();
		StudentA.StudentB stB = stA.new StudentB();

		stB.name = "홍길동";
		stB.age = 19;
		stB.sleep();

		stA.person.wake();

		stA.method1();
		System.out.println();
		
		stA.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}

		});

	}

}
