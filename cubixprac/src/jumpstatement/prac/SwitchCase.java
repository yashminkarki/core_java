package jumpstatement.prac;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int noOfDays = scan.nextInt();
		
		switch(noOfDays) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("NotExist");
		}
		
		System.out.println("-------");
		
		String str = "FOURTH";
		switch(str) {
		case "FIRST":
			System.out.println("Case 1 is ready");
			break;
		case "SECOND":
			System.out.println("Case 2 is ready");
			break;
		case "THIRD":
			System.out.println("Case 3 is ready");
			break;
		case "FOURTH":
			System.out.println("Case 4 is ready");
			break;
		default:
			System.out.println("Default ready");
		}

	}

}
