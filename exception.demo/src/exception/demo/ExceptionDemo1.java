package exception.demo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int num1 = 300;
		int num2 = 100;
		try {
			int result = num1/num2;
			System.out.println("Result(num1/num2) =" +result);
			System.out.println("Thanks,computation is done!");
			
			if (result == 10) {
				return;
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Caught");
		}
		catch(Exception e) {
			System.out.println("General");
		}
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("More dummy message");
		System.out.println("End of main!!");

	}

}
