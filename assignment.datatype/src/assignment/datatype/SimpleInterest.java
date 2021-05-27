package assignment.datatype;

public class SimpleInterest {

	public static void main(String[] args) {
		double principle = 3000;
		double interest = 5;
		int duration = 2;
		
		double simpleInterest = (principle * interest * duration)/100;
		
		double compoundInterest = principle * Math.pow(1 + interest/100 , duration) - principle;
		
		System.out.println("Simple interest is: " + simpleInterest);
		System.out.println("Compound interest is: " + compoundInterest);
		
	}

}
