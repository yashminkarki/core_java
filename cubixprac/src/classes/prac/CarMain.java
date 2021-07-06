package classes.prac;

public class CarMain {
	
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
		System.out.println("ac=" + ac);
		System.out.println("color=" + color);
		System.out.println("wheel=" + wheel);
		
	}
	
	public static void main(String[] args) {
		CarMain c1 = new CarMain();
		CarMain c2 = new CarMain();
		
		c2.color = "yellow";
		c1.info();
		c2.ac = false;
		System.out.println("--------");
		c2.info();
		
		

	}

}
