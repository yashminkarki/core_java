package polymorphism.prac;

public class PolyClass {

	public static void main(String[] args) {
		
		Dog d;
		d = new Dog();
		d.run();
		
		System.out.println("---------");
		
		d = new BlackDog();
		d.run();
		System.out.println("---------");
		
		d = new WhiteDog();
		d.run();
		System.out.println("---------");
		
		d = new BrownDog();
		d.run();
		
		System.out.println("---------");

	}

}
