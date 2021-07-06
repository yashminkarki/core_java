package getter.setter;

public class GetterSetterMain {

	public static void main(String[] args) {
		GetterSetter myObj = new GetterSetter();
		
		myObj.setName("John");
		System.out.println(myObj.getName());
		
		myObj.setA(5);
		
		System.out.println(myObj.getA());
		
		myObj.setColor("Yellow");
		System.out.println(myObj.getColor());

	}

}
