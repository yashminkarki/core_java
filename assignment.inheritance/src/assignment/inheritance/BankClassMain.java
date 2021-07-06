package assignment.inheritance;

public class BankClassMain {

	public static void main(String[] args) {
		BankClass b = new BankClass();
		System.out.println("Bank has a interest rate of " + b.getRateOfInterest() +"%");
		
		b = new SBIBank();
		System.out.println("SBIBank has a interest rate of " +b.getRateOfInterest() + "%");
		
		b = new ICCIBank();
		System.out.println("ICCIBank has a interest rate of " + b.getRateOfInterest()+ "%");
		
		b = new AXISBank();
		System.out.println("AXISBank has a interest rate of " + b.getRateOfInterest()+ "%");
		
		

	}

}
