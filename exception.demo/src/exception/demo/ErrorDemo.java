package exception.demo;

public class ErrorDemo {

	public static void main(String[] args) {
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver");//it can through
		 * ClassNotFoundException (checked exception) } catch (ClassNotFoundException e)
		 * { e.printStackTrace(); System.out.println("connector problem"); }
		 */

		
		  int x=10; 
		 int y=0; 
		  int z=x/y;//will through Arithmetic exception (Unchecked)
		 
		  System.out.println("I am in infine loop");
		
		//example of error
		//function();
		

	}

}
