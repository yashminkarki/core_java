package accessModifier2.demo;

class PrivateAccessDemo {
	
	private void display() {
		System.out.println("Geeks for Geeks");
	}
	
	public static void main(String[] args) {
		PrivateAccessDemo obj = new PrivateAccessDemo();
		obj.display();
	}
}