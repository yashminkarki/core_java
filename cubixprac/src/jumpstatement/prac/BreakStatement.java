package jumpstatement.prac;

public class BreakStatement {

	public static void main(String[] args) {
		//break in for loop
		for(int i = 0; i<=10;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("--------");
		//break in dowhile loop
		
		int j = 1;
		do{
			if(j==3) {
				j++;
				break;
			}
			System.out.println("J is: "+j);
			j++;
		}while(j<=10);
		
		System.out.println("--------");
		//break in while loop
		int i = 1;
		while(i<=10) {
			if(i==3) {
				i++;
				break;
			}
			System.out.println("i is: "+i);
			i++;
		}
	}

}
