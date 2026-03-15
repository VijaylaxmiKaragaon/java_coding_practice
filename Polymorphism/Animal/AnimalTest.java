package Polymorphism.Animal;

public class AnimalTest {
    public static void main(String[] args) {
		Animal a = new Animal();
		a.sleep();
		a.sound();
		System.out.println("--------------");
		
		Animal a1 = new Dog();
		a1.sleep();
		a1.sound();
		
		System.out.println("--------------");
		Animal a2 = new Cat();
		a2.sleep();
		a2.sound();
		
		System.out.println("--------------");
		Animal a3 = new Lion();
		a3.sleep();
		a3.sound();

	}
}
