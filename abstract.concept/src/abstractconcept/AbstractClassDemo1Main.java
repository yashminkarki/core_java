package abstractconcept;

public class AbstractClassDemo1Main {

	public static void main(String[] args) {
		Student myObj = new Student();
		System.out.println("Name: "+ myObj.name);
		System.out.println("age: " + myObj.age);
		System.out.println("Graduation Year: " +myObj.graduationYear);
		
		myObj.study();
		myObj.study1();

	}

}
