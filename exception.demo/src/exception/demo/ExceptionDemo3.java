package exception.demo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		try {
			z=x/y;
		}
		catch(Exception e){
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(z);
		System.out.println("Name");
		System.out.println("US");

	}

}
