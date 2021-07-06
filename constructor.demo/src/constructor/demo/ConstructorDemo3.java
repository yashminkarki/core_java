package constructor.demo;

public class ConstructorDemo3 {
	int modelYear;
	String modelName;
	
	public ConstructorDemo3(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	

	public static void main(String[] args) {
		ConstructorDemo3 myCar = new ConstructorDemo3(1969,"Mustang");
		
		System.out.println(myCar.modelYear + " " + myCar.modelName);

	}

}
