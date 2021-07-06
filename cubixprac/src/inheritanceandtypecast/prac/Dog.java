package inheritanceandtypecast.prac;

public class Dog {
	String name = "Tommy";
	int tail = 2;
	int leg = 4;
	
	public void run() {
		System.out.println("Dog can run");
	}
	public void walk() {
		System.out.println("Dog can walk");
	}
	
}
class BarkDog extends Dog{
	public void bark() {
		System.out.println("Dog can bark");
	}
	
}
