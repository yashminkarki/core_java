package array.demo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0] =12;
		num[1] = 9;
		num[2] = 27;
		num[3] = 10;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		System.out.println("------------------------------");
		
		System.out.println("Printing array data using loop");
		
		for (int abc: num) {
			System.out.println(abc);
		}
		

	}

}
