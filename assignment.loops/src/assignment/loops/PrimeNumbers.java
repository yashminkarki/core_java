//Use while loop to print all prime numbers that comes under 1 to 100.

package assignment.loops;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 100) {
			int j = 1;
			int counter = 0;
			while(j <= i) {
				if (i % j == 0) 
				{
					counter++;
				}
				
				j++;
			}
			if (counter == 2) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}

