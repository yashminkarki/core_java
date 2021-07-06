package array.demo;

public class ArrayExp3 {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0] =12;
		num[1] = 9;
		num[2] = 27;
		num[3] = 10;
		
		System.out.println("Sum operation on given array -----------");
		int sum = 0;
		for (int x = 0 ; x < num.length; x++) {
			
			sum = sum + num[x];
		}
		System.out.println("Total sum is " +sum);
		System.out.println("--------------------");
		num[2] = 3;
		num[3] =80;
		System.out.println("After updating last two values of given array,");
		for(int x = 0 ; x< num.length; x++) {
			System.out.println(num[x]);
		}
		
	}

}
