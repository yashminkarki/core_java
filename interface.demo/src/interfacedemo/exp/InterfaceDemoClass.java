package interfacedemo.exp;

public class InterfaceDemoClass implements InterfaceDemo{
	String name = "Tommy";
	int tail = 0;
	int leg = 2;
	
	public void run() {
		System.out.println("Dog can run");
	}
	
	public void walk() {
		System.out.println("Dog can walk");
	}
	
	public void sleep() {
		System.out.println("Dog can sleep");
	}

}
