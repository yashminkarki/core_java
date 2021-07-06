package test.one;
import java.util.Scanner;
public class SwitchCaseSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which type of operation do you want to perform?");
		System.out.print("1 for sum, 2 for subtract, 3 for multiplication and 4 for division: ");
		
		int choice = input.nextInt();
		switch(choice) {
			case 1: 
				System.out.print("Enter two numbers: ");
				double a = input.nextDouble();
				double b = input.nextDouble();
				System.out.print("The sum of " + a + " and " + b + " is " + (a+b));
				break;
			case 2: 
				System.out.print("Enter two numbers: ");
				a = input.nextDouble();
				b = input.nextDouble();
				System.out.print("The difference of " + a + " and " + b + " is " + (a-b));
				break;
			case 3: 
				System.out.print("Enter two numbers: ");
				a = input.nextDouble();
				b = input.nextDouble();
				System.out.print("The product of " + a + " and " + b + " is " + (a*b));
				break;
			case 4:
				System.out.print("Enter two numbers: ");
				a = input.nextDouble();
				b = input.nextDouble();
				System.out.print("The division of " + a + " by " + b + " gives " + (a/b));
				break;
			default: 
				System.out.print("Invalid input. Please enter options 1-4");
				break;
		}

	}

}
