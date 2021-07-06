package staticinstance.block;

public class LoaderBlock {
	int x = 786;

	LoaderBlock(){
		System.out.println("I am no-arg Constructor.");
	}
	//define instance block
	{
		System.out.println("I am non static Block-instance block");
		x++;
	}
	
	static {
		System.out.println("I am static block-2 and i have initialized after instance block");
	}
	public void print() {
		System.out.println("Value of X = " +x);
	}
	

}
