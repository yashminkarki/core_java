package collection.set;


import java.util.Set;

import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Yashmin");
		set.add("Collection");
		set.add("Interface");
		set.add("Java");
		set.add("Iterables");
		set.add("Iterables");  //due to feature of set, iterable wont be printed
		
		System.out.println(set);
		System.out.println("**********************");
		
		for(String s: set) {
			System.out.println(s);
		}
		System.out.println("**********************");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
