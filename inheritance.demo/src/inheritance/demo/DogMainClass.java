package inheritance.demo;

public class DogMainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
		d.walk();
		
		//d.bark()  -- does not execute as bark is a member of BarkDog class
		
		System.out.println("---------------------------");
		System.out.println("See the effect of upcasting");
		System.out.println("---------------------------");
		
		//Dog b = new BarkDog();
		
		Dog b = new BarkDog();
		b.walk();
		b.run();
		// b.bark();  shows compile time error because bark() is not a part of Dog class
		System.out.println("---------------------------");
		System.out.println("See the effect of downcasting");
		System.out.println("---------------------------");
		
		Dog e;
		e = new BarkDog();
		BarkDog bd = (BarkDog)e;
		
		//BarkDog bd = new BarkDog(); we can assign it this way
		
		
		bd.bark();
		bd.walk();  //we can now access the method of superclass from subclass
		bd.run();
		
		
		System.out.println("---------------------------");
		
		BarkDog sl = new SleepDog(); //downcasting
		SleepDog s = (SleepDog)sl; //
		
		SleepDog sd = new SleepDog(); //upcasting
		
		
		s.sleep();
		s.run();
		s.bark();
		
		
		
	}

}
