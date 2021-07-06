package test.one;

public class Employee {
	String name = "";
	String city = "";
	int age, ssn;
	String country = "";
	
	public void getData(String s, String x, int y, int z, String t) {
		name = s;
		city = x; 
		age = y;
		ssn = z; 
		country = t;
	}
	public void printData() {
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Age: " + age);
		System.out.println("Ssn: " + ssn);
		System.out.println("Country: " + country);
		
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.getData("Yashmin", "Dallas", 23, 12647 ,"Usa");
		
		e.printData();
	}
}
