package classes.objects;

public class CarDemo {

	String color = "red";
	int wheel = 4;
	boolean ac = true;
	
	public void start() {
		System.out.println("Car starts");
	}
	public void run() {
		System.out.println("Car is running");
	}
	public void info() {
		System.out.println("ac= "+ac);
		System.out.println("Color= "+color);
		System.out.println("wheel= "+wheel);
	}
	
	public static void main(String[] args) {
		CarDemo c1 = new CarDemo();
		CarDemo c2 = new CarDemo();
		
		c2.color = "yellow";
		c1.info(); 
		
		c2.ac = false;
		System.out.println("------------------");
		c2.info();
		c1.info();
	}


}
