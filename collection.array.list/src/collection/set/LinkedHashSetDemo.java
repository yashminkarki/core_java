package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet();
		set.add("Yashmin");
		set.add("John");
		set.add("Apple");
		set.add("Java");
		set.add("Eclipse");
		set.add("Jean");
		set.add("Patricia");
	
		set.add("Yashmin");
		set.add(new String("Yashmin"));
		
		System.out.println(set);
		System.out.println("**********************************");
		
		for(String s: set) {
			System.out.println(s);
		}


	}

}
