package array.demo;

public class ArrayExp4 {

	public static void main(String[] args) {
		int arr[] = new int[] {12,16,10,9};
		System.out.println("Printing values from the array using for loop");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] *= 3;
			
		}
		
		System.out.println("------------------------------");
		
		System.out.println("After multiplication, new values of Array are: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);}
		System.out.println("------------------------------");
		
		System.out.println("Another syntax to print the elements of Array are: ");
		for(int said: arr) {
			System.out.print(said);
		}
	}

}
