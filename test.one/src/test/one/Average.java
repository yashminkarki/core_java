package test.one;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		int sum = 0;
		
		System.out.print("Enter 10 different inetgers for an array: ");
		for(int i = 0 ; i < 10; i++) {
			num[i] = input.nextInt();
		}
		
		for(int i = 0; i < 10 ; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum is: "+ sum);
		System.out.println("Average is: "+ ((double)sum/num.length));
		
		int max = num[0];
		int min = num[0];
		
		for(int j = 1; j < num.length ;j++) {
			
			if(num[j] < min) {
				min = num[j];
			}
			else if(num[j] > max){
				max = num[j];
			}
		}
		
		System.out.println("The largest number is " +max + " and smallest number is " + min);
		
		System.out.println("The length of the array is: " + num.length);
		
		System.out.println("The first number of the array is: " + num[0]);
		
		System.out.println("The last number of the array is: " + num[num.length-1]);

		
	}

}
