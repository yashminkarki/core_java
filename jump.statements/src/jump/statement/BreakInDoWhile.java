package jump.statement;

public class BreakInDoWhile {

	public static void main(String[] args) {
		int i = 1;
		
		do {
			if (i == 3) {
				i++;
				break;
			}
		System.out.println("Print the value of I " + i);
		
		i++;
		}while(i<=10);

	}

}
