package collection.set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("Apple");
		set.add("Mango");
		set.add("Orange");
		set.add("Banana");
		set.add("Papaya");
		set.add("Apple");
		set.add(new String("Guava"));
		set.add("Guava");
	
		
//		System.out.println(set);
//		System.out.println("**********************");
		
		for(String s: set) {
			System.out.println(s);}
		
		
		
	}

}
