package interfacedemo.exp;

public class InterfaceDemoMain {

	public static void main(String[] args) {
		InterfaceDemo du = new InterfaceDemoClass();
		
		du.walk();
		du.run();
		System.out.println("Tail: " + du.tail);
		System.out.println("Leg: " + du.leg);
		
		System.out.println("----------------------");
		
		System.out.println("From class");
		
		InterfaceDemoClass d = new InterfaceDemoClass();
		d.sleep();
		System.out.println("Tail: " + d.tail);
		System.out.println("Leg: " + d.leg);
		
	}

}
