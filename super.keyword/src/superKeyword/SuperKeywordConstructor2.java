package superKeyword;

public class SuperKeywordConstructor2 {
	String name;
	SuperKeywordConstructor2(String name){
		this.name = name;
	}
	
	public void printName() {
		System.out.println("name = " +name);
	}
}


class SuperKeywordConstructor2Sub extends SuperKeywordConstructor2{
	private String color;
	
	public SuperKeywordConstructor2Sub(String name, String color) {
		super(name);
		this.color = color;
	}
	public void showAll() {
		System.out.println("name from super class = " +name);
		System.out.println("color from current class = " +color);
	}
	
}