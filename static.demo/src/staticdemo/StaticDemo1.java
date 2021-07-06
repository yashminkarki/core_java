package staticdemo;

public class StaticDemo1 {
	
	int price = 230;
	static void banana() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		StaticDemo1.banana();
		StaticDemo1 fruit = new StaticDemo1();
		System.out.println(fruit.price);

	}

}
