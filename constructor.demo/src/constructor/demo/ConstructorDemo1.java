package constructor.demo;

public class ConstructorDemo1 {
	String name = "Boby";
	int eyes = 2;
	int tail = 1;
	String color = "blue";
	
	public ConstructorDemo1(){
		 System.out.println("No arg Constructor called");
		}
	public ConstructorDemo1(String n, int e){
		 name = n;
		 eyes = e;
		}
	public ConstructorDemo1(int p, String q, String c){
		 eyes = p;
		 name = q;
		 color = c;
		}

	// ,isis,ssii,iis
	
	public ConstructorDemo1(String s, int a, String t, int b) {
		name = s;
		tail = a;
		color = t;
		eyes = b; 
		
	}
	
	public ConstructorDemo1(String s, int a, int b, String t) {
		name = s;
		tail = a;
		eyes = b;
		color = t; 
		
	}
	
	
	public void run() {
		System.out.println("Dog is running");
	}
	public void print() {
		System.out.println(tail);
	}
	
	public static void main(String[] args) {
		ConstructorDemo1 d1 = new ConstructorDemo1();
		System.out.println(d1.color);
		System.out.println(d1.tail);
		System.out.println(d1.eyes);
		System.out.println(d1.name);
		d1.run();
		d1.print();
		
		System.out.println("--------------------------");
		
		ConstructorDemo1 d2 = new ConstructorDemo1("Tommy", 4);
		System.out.println(d2.name);
		System.out.println(d2.eyes);
		d2.run();
		d2.print();
		
		System.out.println("---------------------------");
		
		ConstructorDemo1 d3 = new ConstructorDemo1(3, "Jack" ,"red");
		System.out.println(d3.eyes);
		System.out.println(d3.name);
		System.out.println(d3.color);
		d3.run();
		d3.print();
		
		System.out.println("--------------------------------");
		ConstructorDemo1 d4 = new ConstructorDemo1("Tommy", 1, "blue", 2);
		System.out.println(d4.name);
		System.out.println(d4.tail);
		System.out.println(d4.color);
		System.out.println(d4.eyes);
		
		System.out.println("----------------------------------");
		
		ConstructorDemo1 d5 = new ConstructorDemo1("Jen", 1, "light brown", 1);
		System.out.println(d5.name);
		System.out.println(d5.tail);
		System.out.println(d5.color);
		System.out.println(d5.eyes);
		
		
	
	}

}
