package iteration.statement;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		int x;
		
		for (x = 2; x <= 20; x++)
		{
			for (int a = 1; a <= 10; a++)
			{
				System.out.println("Value of x: " + x * a);
					
			}
			System.out.println("*******");
			System.out.print("\n");
				
		}

	}

}