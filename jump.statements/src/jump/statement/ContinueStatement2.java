package jump.statement;

public class ContinueStatement2 {

	public static void main(String[] args) {
		
		for (int i = 0 ;i < 10; i++) {
			if (i==7) {
				continue;
			}
			System.out.println("Print the value of i "+i);
			
		}

	}

}
