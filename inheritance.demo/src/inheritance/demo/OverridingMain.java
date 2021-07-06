package inheritance.demo;

public class OverridingMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
		
		System.out.println("------------------------");
		
		d = new BarkDog();
		d.run();
		System.out.println("------------------------");
		
		d = new BrownDog();
		d.run();
		System.out.println("------------------------");
		
		d = new WhiteDog();
		d.run();
	}
}
