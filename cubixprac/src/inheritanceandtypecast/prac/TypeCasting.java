package inheritanceandtypecast.prac;

public class TypeCasting {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
		d.walk();
		
		System.out.println("-----------");
		System.out.println("See the effect of upcasting");
		System.out.println("-----------");
		
		Dog b = new BarkDog();
		b.run();
		b.walk();
		
		System.out.println("-----------");
		System.out.println("See the effect of downcasting");
		System.out.println("-----------");
		
		Dog e;
		e = new BarkDog();
		BarkDog bd = (BarkDog)e;
		
		bd.bark();
		bd.run();
		bd.walk();
		
	}

}
