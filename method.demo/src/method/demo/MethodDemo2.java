package method.demo;

public class MethodDemo2 {

	public static void main(String[] args) {
		int wow = magic(3);
		System.out.println(wow);
		wow = magic (2);
		System.out.println(wow);
		
		printa(wow);
		chill();

	}
	
	static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	static int magic(int input) {
		int result = 9033 % input;
		result = result * 100;
		return result +1;
	}
	static float foo() {
		return 1923.0f;
	}
	static void chill() {
		System.out.println("chill");
		
	}
	static void printa(int pp) {
		System.out.println("*****************");
		System.out.println("********" + pp + "**********");
		System.out.println("*****************");

	}
	
	
	
	
	
	

}
