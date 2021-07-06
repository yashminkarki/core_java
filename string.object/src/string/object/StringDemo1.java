package string.object;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Robert";
		String s2 = "John";
		String s3 = new String("Peter");
		
		System.out.println(2+3+s1);
		System.out.println(s1 + 2 +3);
		System.out.println(4+11 +s1 + 2);

		//UPPER CASE CONVERSION METHOD
		 //String upper=s1.toUpperCase();
		// System.out.println(upper);

		 //System.out.println(s1.toUpperCase()); // same work as above mentioned two
	      

		//LENGTH METHOD
		 //System.out.println(s1.length());//find length of string(counting will start
		
		// System.out.println(s2.length());//find length of string(counting will start from 1) */

		
		//charAt METHOD
		// ch=str.charAt(x)
		 //System.out.println(s1.charAt(0));
		//System.out.println(s1.charAt(5));// print last character from Strings1(static)
		
		//LENGTH METHOD
		 /*int len=s1.length();
		 System.out.println(s1.length());
		 System.out.println(s1.charAt(len-1));// print last character from String s1 (dynamic) */

		
		//charAt method
		/*String str = "Agile and Scrum";
		for (int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x);
			System.out.println("x = " + ch);
		} */
	
		
		//SUBSTRING METHOD
		/*String str1 = "Agile";
		String substr = str1.substring(1, 5);
		 System.out.println("Sub String is===" + substr);*/
		
		
		//SPLIT METHOD
		/*String str2 = "java Spring Hibernate JSP";
		String strTokens[]=str2.split("  ");
		 for(String t:strTokens) {
			 System.out.println(t);	 
		} */
	
		 
		//equals() and == operator
		/*String s4=new String("abc");
		String s5=new String("abc");
		System.out.println(s4==s5);	 //FALSE
		 
		String s6=new String("abc");
		String s7=new String("abc");
		System.out.println(s6.equals(s7));	//TRUE    */
		
		//indexOf method
		String str="java spring hibernate jsp ";
		int len=str.indexOf("java");
		System.out.println("index = "+len);  
	}

	}

