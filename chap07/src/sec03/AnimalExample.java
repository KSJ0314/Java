package sec03;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog("");
		Cat cat = new Cat("");

		dog.sound();
		cat.sound();

		Animal animal = new Dog("");
		animal.sound();

		animal = cat;
		animal.sound();

		animalSound(new Dog(""));
		animalSound(new Cat(""));
//		animalSound(new Animal());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
