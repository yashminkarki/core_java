package iteration.statement;

public class CheckPrime {

	public static void main(String[] args) {
		int num = 31;
		boolean flag = false;
		
		for(int i = 2; i < num ; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}
		
		if (flag == false) {
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is not a prime number");
		}

	}

}
