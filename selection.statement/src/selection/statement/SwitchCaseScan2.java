package selection.statement;
import java.util.Scanner;

public class SwitchCaseScan2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int noOfDays = input.nextInt();
		
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
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunday");
				break;
			default: 
				System.out.print("Not exist");
				break;
		
		
		}
	}

}
