package sec02;

public class StudentA {

	String h = "h";

	Person person = new Person() {

		void work() {
			System.out.println("�б��� ���ϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}

	};

	class StudentB {
		String name;
		int age;

		void sleep() {
			System.out.println("���� ��ϴ�.");
		}
	}

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
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

		stB.name = "ȫ�浿";
		stB.age = 19;
		stB.sleep();

		stA.person.wake();

		stA.method1();
		System.out.println();
		
		stA.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}

		});

	}

}
