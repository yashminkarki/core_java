package classes.prac;

class Dog {

	int eyes = 2;
	int tail = 1;
	String color = "Brown";
	
	void run() {
		System.out.println("Dog is running");
	}
	void bark() {
		System.out.println("Dog can bark");
	}
	
	void print() {
		System.out.println("tail: " + tail);
		System.out.println("eyes: " + eyes);
		
	}

}
class DogMain {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
		d.bark();
		d.print();
	}
	
}