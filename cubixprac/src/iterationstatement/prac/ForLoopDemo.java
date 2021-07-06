package iterationstatement.prac;

public class ForLoopDemo {

	public static void main(String[] args) {
		int i, num = 10, sum = 0;
		
		for(i = 1; i<=num; i++) {
			sum = sum + i;
			
		}
		System.out.println("Sum of first 10 numbers is: "+ sum);
		
		System.out.println("----------------");
		
		//To check if given num is prime or not
		
		int a = 31;
		boolean bool = true;
		
		for(int j = 2; j<a; j++) {
			if (a % j == 0) {
				bool = false;
			}
			
		}
		
		if (bool) {
			System.out.println(a + " is a prime number");
		}
		else {
			System.out.println(a + " is not a prime number");
		}
		
		System.out.println("----------------");
		
		//Printing inner and outer loop
		int x, y;
		for(x = 1; x<=3;x++) {
			for(y = 1; y<=5;y++) {
				System.out.println("I am inner for loop");
			}
			System.out.println("I am outer for loop");
		}
		
		//Generate prime numbers
		
		int b = 0, number = 0;
		String primeNumbers = " ";
		for(b = 1; b <= 100; b++) {
			int counter = 0;
			for(number = 1; number <=b;number++) {
				if(b % number == 0) {
					counter++;
				}
			}
			
			if(counter == 2) {
				primeNumbers = primeNumbers + b + " ";
			}
		}
		
		System.out.println("Prime numbers from 1 to 100 is ");
		System.out.println(primeNumbers);
		
	}
}
