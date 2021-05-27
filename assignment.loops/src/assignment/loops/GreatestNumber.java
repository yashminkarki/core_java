//Find the greatest number among three inputs.

package assignment.loops;

public class GreatestNumber {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 1;
		
		int max = x;
		
		if (y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
		
		System.out.println("The greatest number among three inputs is: " + max);

	}

}
