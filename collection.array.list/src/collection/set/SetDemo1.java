package collection.set;



import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<Dog> set = new HashSet<>();
		Dog d1 = new Dog(5,"Jocky","White");
		Dog d2 = new Dog(3,"Tommy","Black");
		Dog d3 = new Dog(6,"Doggy","Brown");
		Dog d4 = new Dog(6,"Doggy","Brown");
		
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);
		
		System.out.println(set);
		System.out.println("---------------------");
		
		for(Dog d: set) {
			System.out.println(d);
		}
		System.out.println("**********************");
		
		Iterator<Dog> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
