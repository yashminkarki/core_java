package staticdemo;

public class StaticDemo2 {

	String name;
	static String color;
	
	public StaticDemo2(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public void info() {
		System.out.println("Name: "+ name);
		System.out.println("this.name: " + this.name );
		System.out.println("Color: "+color);
		System.out.println("StaticDemo2.color: "+ StaticDemo2.color);
	}

}
