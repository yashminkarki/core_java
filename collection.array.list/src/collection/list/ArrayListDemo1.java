package collection.list;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		Dog dog1 = new Dog(5,"Jocky","White");
		Dog dog2 = new Dog(3, "Tommy", "Black");
		Dog dog3 = new Dog(6,"Doggy","Brown");

		
		List<Dog> list = new ArrayList<>();
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		
		System.out.println(list);
		System.out.println("---------------------");
		
		//Search
		Dog dog4 = new Dog(5,"Jocky","White");
		System.out.println(list.contains(dog4)); //contains calls equals method internally
		//and provides result in boolean form
		System.out.println("---------------------");
		
		
		//By using comparable we can sort the data on the basis of attributes
		Collections.sort(list);
		System.out.println(list);
		
		//sorting by Comparator(color)
		Collections.sort(list, new SortingByColorComparator());
		System.out.println(list);
		
		//sorting by Comparator(name)
		Collections.sort(list, new SortingByNameComparator());
		System.out.println(list);
		
		

	}

}
