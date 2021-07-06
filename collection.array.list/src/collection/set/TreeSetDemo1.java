package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("Dog");
		set.add("Cat");
		set.add("Snake");
		set.add("Alligators");
		set.add("Hamster");
		set.add("Cat");
		set.add(new String("Snake"));
		
//		System.out.println(set);
//		System.out.println("********************");
		
		//Iteration
		for(String p: set) {
			System.out.println(p);
		}
		System.out.println("***********************");
		
		Set<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(1);
		set1.add(7);
		set1.add(4);
		
		System.out.println(set1);
		System.out.println("--------------------------");

	}

}
