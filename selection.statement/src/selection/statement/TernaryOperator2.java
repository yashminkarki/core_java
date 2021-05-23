package selection.statement;

public class TernaryOperator2 {

	public static void main(String[] args) {
		int age = 35;
		String gender = "male";
		String str;
		
		str = (age <= 30 && gender == "male") ? "You are eligible" : "You are not eligible";
		System.out.print(str);

	}
}
