package arrayandmethodprac;

public class ArrayPrac1 {

	public static void main(String[] args) {
		int num[] = new int [8];
		num[0] = 12;
		num[1] = 9;
		num[2] = 27;
		num[3] = 10;
		num[4] = 90;
		num[5] = 100;
		num[6] = 110;
		num[7] = 120;
		
		for(int abc: num) {
		System.out.print(abc + " ");
		
		}
		
		System.out.println("----------");
		
		int arr[] = new int[4];
		arr[0] = 12;
		arr[1] = 9;
		arr[2] = 27;
		arr[3] = 10;
		
		//sum of array
		int sum = 0;
		for(int i= 0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Total sum is "+sum);
		
		arr[2] = 0;
		arr[3] = 80;
		System.out.println("After updating values of an array");
		for (int abc:arr) {
			System.out.print(abc + " ");
		}
		
		
		
	}

}
