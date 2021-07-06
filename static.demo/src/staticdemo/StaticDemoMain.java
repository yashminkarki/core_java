package staticdemo;

public class StaticDemoMain {

	public static void main(String[] args) {
		
		StaticDemo fruit = new StaticDemo();
		
		StaticDemo.banana();
		System.out.println(StaticDemo.name);

		System.out.println(fruit.price);
	}

}
