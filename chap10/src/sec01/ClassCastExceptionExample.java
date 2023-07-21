package sec01;

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal;
		animal = dog;
		changeDog(animal);
		animal = cat;
		changeDog(animal);

		changeDog(dog);
		changeDog(cat);

	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}
