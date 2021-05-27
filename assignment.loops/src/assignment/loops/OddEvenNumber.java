//Use for loop to Print all odd number and even numbers separately which comes under 1 to 100.

package assignment.loops;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		int i;
		String evenNumber = " ";
		String oddNumber = " ";
		
		for(i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenNumber = evenNumber + i + " ";
			}
			else {
				oddNumber = oddNumber + i + " ";
			}
		}
		System.out.println("Even numbers between 1 to 100 are:" + evenNumber);
		System.out.println("Odd numbers between 1 to 100 are:" + oddNumber);
		
	}

}
