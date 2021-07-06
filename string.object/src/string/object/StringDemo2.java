package string.object;

public class StringDemo2 {

	public static void main(String[] args) {
		String str2 = "Yashmin,Karki";
		String strTokens[] = str2.split(",");
		for(String t:strTokens) {
			System.out.println(t);
		}

	}

}
