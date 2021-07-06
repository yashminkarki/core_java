package classes.objects;


class DogMain{
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.run();
		d.bark();
		d.print();
		d.color = "white";
		System.out.println("color: " + d.color);
		Dog d2 = new Dog("Black" , 3,1);
		d2.print();
		System.out.print(d2.color);
	}
}

