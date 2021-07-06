package thisandstatickeyword.prac;

public class ThisPrac1 {
	int num1;
	int num2;
	String str;
	
	public ThisPrac1(int num1, String str) {
		this.num1 = num1;
		this.str = str;
	}
	public ThisPrac1(String str, int num1) {
		this.num1 = num1;
		this.str = str;
	}

	public static void main(String[] args) {
		ThisPrac1 tp = new ThisPrac1(25, "A");
		System.out.println(tp.num1);
		System.out.println(tp.str);
		
		System.out.println("-----------");
		ThisPrac1 tp1 = new ThisPrac1("AAB", 30);
		System.out.println(tp1.num1);
		System.out.println(tp1.str);
		
		
	}

}
