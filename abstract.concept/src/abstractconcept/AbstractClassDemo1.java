package abstractconcept;

abstract class AbstractClassDemo1 {
	
	 public int age = 21;
	 public String name = "Robert";

	abstract public void study();
	
	public void study1() {
		System.out.println("Studying in night");
		}

}

class Student extends AbstractClassDemo1{
	public int graduationYear = 2021;
	public void study() {
		System.out.println("Studying all day long");
	}
	

	
}
