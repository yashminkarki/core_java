package operators.prac;

public class TernaryOperator {

	public static void main(String[] args) {
		int februaryDays = 29;
		String result;
		int x = 20;
		String result1;
		
		result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result);
		
		
		result1 = (x<18) ? "good day" : "good evening";
		System.out.println(result1);

	}

}
