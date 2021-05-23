package iteration.statement;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		int x, y;
		
		for (x = 1; x <= 3; x++) {
			for (y = 1; y <= 5; y++) {
				System.out.println("I am the INNER FOR LOOP");
			
			}
			System.out.println("I am outer for loop");
		}

	}

}
