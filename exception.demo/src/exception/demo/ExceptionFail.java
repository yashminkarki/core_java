package exception.demo;

public class ExceptionFail {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 0;
		int num = 0;
		try {
			num = num1/num2;
			System.out.println("Processing is done");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Result num is ="+num);
		System.out.println("Welcome "+Thread.currentThread().getName()+"thread");

	}

}
