package thisandstatickeyword.prac;

class MobileVar{
	String name;
	static String color;
	
	public MobileVar(String name, String color) {
		this.name = name;
		this.color = color;
		
	}
	
	public void info() {
		System.out.println("Name: " + name);
		System.out.println("this.name: " + this.name);
		System.out.println("Color: " + color);
		System.out.println("MobileVar.color: " + MobileVar.color);
		
	}	

}

public class MobileVarMain {
	public static void main(String[] args) {
		MobileVar m1 = new MobileVar("Nokia", "Pink");
		MobileVar m2= new MobileVar("Samsung", "Blue");
		MobileVar m3= new MobileVar("iphone", "White");
		MobileVar m4= new MobileVar("Oppo", "Red");
		m1.info();
		
		m2.info();
		
		m3.info();
		
		m4.info();
		
	}	
}
