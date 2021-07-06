package thisandstatickeyword.prac;

public class ThisPrac {
	int p =45; //object attribute/class instance variable
	public void print()
	{
		int p = 90;
		System.out.println(p);
		System.out.println(this);
		System.out.println(this.p);
		
		}

	public static void main(String[] args) {
		ThisPrac tp = new ThisPrac();
		tp.print();

	}

}
