package constructor.demo;

public class ThisDemo2 {
	
	int p =45;
	
	public void print() {
		int p = 90;
		System.out.println(p);
		System.out.println(this);
		System.out.println(this.p);
		
	}

	public static void main(String[] args) {
		ThisDemo2 junk = new ThisDemo2();
		junk.print();
	}

}
