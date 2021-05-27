//Check whether given year is leap year or not
package assignment.loops;

import java.util.Scanner;
public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int years = input.nextInt();
		
		if (years % 4 == 0)
		{
			if ((years % 100 == 0) && (years % 400 == 0)) {
				System.out.println(years + " is a leap year");
			}
			
			else if ((years % 100 == 0) && !(years % 400 == 0)) {
				System.out.println(years + " is not a leap year");
			}
			else {
				System.out.println(years + " is a leap year");
			}
		}	
		else {
			System.out.println(years + " is not a leap year");
		}
	
	}
}
