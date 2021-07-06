package constructor.prac;

public class ConstructorPrac {
	int x;
	
	public ConstructorPrac(int y) {
		x=y;
	}

	public static void main(String[] args) {
		ConstructorPrac myObj = new ConstructorPrac(10);
		
		System.out.println(myObj.x);
		
		ConsDemo myCar = new ConsDemo(1969, "Mustang");
		System.out.println(myCar.modelYear + " " +myCar.modelName);

	}

}

class ConsDemo{
	int modelYear;
	String modelName;
	
	public ConsDemo(int year, String name) {
		modelYear= year;
		modelName= name;
	}
}
