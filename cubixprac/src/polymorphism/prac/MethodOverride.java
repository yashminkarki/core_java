package polymorphism.prac;

public class MethodOverride {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.walk();
		System.out.println("See the effect of method overriding");
		
		d = new BarkDog();
		d.walk();
		

	}

}


