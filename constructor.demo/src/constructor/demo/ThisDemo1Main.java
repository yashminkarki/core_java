package constructor.demo;

public class ThisDemo1Main{
	public static void main(String[] args) {
		ThisDemo1 td1 = new ThisDemo1(21, "Yashmin");
		System.out.print(td1.num1 + " ");
		System.out.println(td1.str);
		
		
		ThisDemo1 td2 = new ThisDemo1("Kate", 25);
		System.out.print(td2.str+ " ");
		System.out.print(td2.num1);
		
		
		
	}

}