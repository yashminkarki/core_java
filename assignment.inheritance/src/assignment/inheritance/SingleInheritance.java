package assignment.inheritance;

public class SingleInheritance {
	int x = 10;
	
	public void hello() {
		System.out.println("Hi from parent class called by child class");
	}

}

class SingleInheritanceSub extends SingleInheritance{
	public void hello1() {
		System.out.println("Hi from child class");
	}
	
}