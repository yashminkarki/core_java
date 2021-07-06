package method.overloading;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.disp('x', 51);
		
		System.out.println("------------------------------------------");
		
		obj.disp(52, 'y');

	}

}
