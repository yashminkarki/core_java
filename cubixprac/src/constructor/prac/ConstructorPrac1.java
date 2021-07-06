package constructor.prac;

public class ConstructorPrac1 {
	
	String name = "Boby";
	int eyes = 2;
	int tail = 1;
	String color = "blue";
	
	public ConstructorPrac1() {
		System.out.println("No arg Constructor called");
	}
	public ConstructorPrac1(String n, int e) {
		name = n;
		eyes = e;
	}
	public ConstructorPrac1(int e,String n, String c) {
		name = n;
		eyes = e;
		color = c;
	}
	
	public void run() {
		System.out.println("Dog is running");
	}
	public void print() {
		System.out.println(tail);
	}

	public static void main(String[] args) {
		ConstructorPrac1 d1 = new ConstructorPrac1();
		System.out.println(d1.color + " " + d1.tail + " " + d1.name + " " + d1.eyes);
		d1.run();
		d1.print();
		
		System.out.println("----------");
		ConstructorPrac1 d2 = new ConstructorPrac1("Tommy",4);
		System.out.println(d2.color + " " + d2.tail + " " + d2.name + " " + d2.eyes);
		d2.run();
		d2.print();
		
		System.out.println("----------");
		ConstructorPrac1 d3 = new ConstructorPrac1(5,"Jack","red");
		System.out.println(d3.color + " " + d3.tail + " " + d3.name + " " + d3.eyes);
		d3.run();
		d3.print();
		
	}

}
