package constructor.demo;

public class ThisDemo3 {
	int a;
	int b;
	int num1, num2;
	String pp;
	
	ThisDemo3(int a, int b){
		this.a = a;
		this.b = b;
	}
	ThisDemo3(int num1, String pp){
		this.num1 = num1;
		this.pp = pp;
	}
	void display() {
		System.out.println("a = "+a+" b =" +b);
	}

	public static void main(String[] args) {
		ThisDemo3 ob = new ThisDemo3(10,20);
		ob.display();

	}

}
