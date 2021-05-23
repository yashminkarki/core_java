package selection.statement;

public class IfElse {

	public static void main(String[] args) {
		int num = 8;
		if (num % 2 == 0) {
			System.out.println("Given number is even");
			System.out.println("I am going to perform add operation");
			float x = 9.2F;
			int y = 12;
			float result = x + y;
			System.out.println("Result is " + result);
		}
		else {
			System.out.println("Given number is odd");
			System.out.println("I am going to perform subtract operation");
			float x = 9.2F;
			int y = 6;
			float result = x - y;
			System.out.println("Result is " + result);
			
		}

	}

}
