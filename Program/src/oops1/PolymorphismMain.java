package oops1;

public class PolymorphismMain {

	public static void main(String[] args) {
		System.out.println("main() started");
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		AnimalSimulator an = new AnimalSimulator();
				an.makeNoise(c1);
				an.makeNoise(d1);
		System.out.println("main() ended");
	}

}
