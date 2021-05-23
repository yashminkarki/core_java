package selection.statement;

public class NestedIf {

	public static void main(String[] args) {
		int age = 30;
		int weight = 50;
		
		if(age >= 30) 
		{
			if(weight < 69) 
			{
				System.out.println("You are eligible to donate blood");
			}
		}
	}
}
