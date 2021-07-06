package test.one;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		int i = 0, num = 0;
		
		for (i = 2; i <= 100 ;i++) {
			int count = 0;
			for (num = 1; num <= 100; num++) {
				if (i % num == 0) {
					count += 1;
				}
			}
			if (count == 2) {
				
				System.out.print(i + " ");
			}
		}
	}

}
