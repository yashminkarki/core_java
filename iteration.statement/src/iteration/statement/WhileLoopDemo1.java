package iteration.statement;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		int x = 1, sum = 0;
		while(x <= 20) {
			sum = sum + x;
			x++;
			
		}
		System.out.println("Summation: "+ sum);

	}

}
