package exception.demo;

public class CheckedDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//it can through ClassNotFoundException (checked exception)
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("connector problem");
		}
		//int x=10;
		 //int y=0;
		// int z=x/y;//will through Arithmetic exception (Unchecked)

	}

}
