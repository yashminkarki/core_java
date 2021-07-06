package selection.statement;

public class SwitchStatement {

	public static void main(String[] args) {
		char ch = 'a';
		
		switch(ch) {
			case 'a' :
				int a = 70; int b= 20;
				int sum = a+b;
				System.out.println(sum);
				System.out.println("Case -a is ready");
				break;
			case 'b' :
				int x= 40; int y= 10;
				int z = x-y;
				System.out.println(z);
				System.out.println("Case -b is ready");
				break;
				
			case 'c' :
				System.out.println("Case -c is ready"); break;
				
			case 'd':
				System.out.println("Case -d is ready"); break;
			default:
				System.out.println("Default is ready"); break;
		
		
		
		
		}

	}

}
