package iterationstatement.prac;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int x = 1;
		while(x<10) {
			System.out.print("value of x is " + x);
			System.out.print("\n");
			x++;
		}
		
		int num = 1, sum=0;
		while(num <= 20) {
			
			sum = sum + num;
			num++;
		}
		System.out.println("sum is: " +sum);

	}

}
