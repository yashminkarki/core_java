package jump.statement;

public class BreakInWhile {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			if(i == 3) {
				i++;
				break;
			}
			System.out.println("Value of i: " + i);
			i++;
		}
	
	}

}
