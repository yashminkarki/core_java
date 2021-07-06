package selectionstatement.prac;

public class IfElseCondition {

	public static void main(String[] args) {
		int x = 30;
		if(x < 20) {
			System.out.println("This is if statement");
		}
		else {
			System.out.println("This is else statement");
		}
		
		System.out.println(" --------- ");
		int num = 9;
		
		if(num%2 == 0) {
			System.out.println("Given number is even");
			float a = 9.2f;
			int b = 12;
			float result = a + b;
			
			System.out.println("Result is " + result);
			
		}
		else {
			System.out.println("Given number is odd");
			float a = 9.2f;
			int b = 6;
			float result = a - b;
			
			System.out.println("Result is " + result);
			
			
		}

	}


}
