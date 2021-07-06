package constructor.demo;

public class ConstructorExp {
	int x;
	
	public ConstructorExp() {
		x = 5;
	}

	public static void main(String[] args) {
		ConstructorExp myObj = new ConstructorExp();;
		System.out.println(myObj.x);

	}

}
