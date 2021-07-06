package polymorphism.prac;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloadingClass m = new MethodOverloadingClass();
		m.disp('x', 51);
		m.disp(52, 'y');

	}

}
class MethodOverloadingClass{
	public void disp(int num, char c) {
		System.out.println("I am the first defintion");
		
	}
	public void disp(char c, int num) {
		System.out.println("I am the second defintion");
		
	}
}