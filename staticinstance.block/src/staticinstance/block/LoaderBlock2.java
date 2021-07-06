package staticinstance.block;

public class LoaderBlock2 {
	int x = 786;

	static {
		System.out.println("I am Static Block -1");
	}
	
	LoaderBlock2(){
		System.out.println("I am no-arg constructor");
	}
	
	{
		System.out.println("I am non static block- instance block");
		x++;
	}
	
	static {
		System.out.println("I am Static Block -2 and i have initialized after instance block");
	}
	
	public void print() {
		System.out.println("Value of X = " +x);

	}

}
