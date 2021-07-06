package hash.code;

public class HashDemo2 {

	public static void main(String[] args) {
		String str1 = "Yashmin";
		System.out.println(str1.hashCode());
		
		String str2 = new String("Yashmin");
		System.out.println(str2.hashCode());
		
		String str3 = new String("Eclipse");
		System.out.println(str3.hashCode());
		
		System.out.println("--------------------");
		Integer in = 263452347;
		System.out.println(in.hashCode());
		Integer i = new Integer(263452347);
		System.out.println(i.hashCode());
	
		
	} 

}
