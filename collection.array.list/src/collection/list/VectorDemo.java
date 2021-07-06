package collection.list;

import java.util.Vector;
import java.util.Collections;

public class VectorDemo {

	public static void main(String[] args) {
		//if insertion and deletion operation occurs frequently, use linked list 
		Vector list = new Vector();
		list.add("Yashmin");
		list.add("Collection");
		list.add("Interface");
		list.add("Java");
		list.add("Iterables");
		list.add(10);
		
		System.out.println(list);
		System.out.println("**********************");
		
		Vector<String> list1 = new Vector<>();
		list1.add("java");
		list1.add("yashmin");
		list1.add("eclipse");
		list1.add("workspace");
		list1.add("java");
		
		System.out.println(list1);
		System.out.println("**********************");
		
		Vector<Integer> list3 = new Vector<>();
		list3.add(13);
		list3.add(5);
		list3.add(9);
		list3.add(6);
		list3.add(10);
		list3.add(1);
		list3.add(2);
		System.out.println(list3);
		
		System.out.println("--------------");
		//search
		System.out.println(list3.contains(10));
		
		System.out.println(list3.contains("version"));
		
		//Sort integer
		Collections.sort(list3);
		System.out.println(list3);
		System.out.println("--------------");
		
		//Sort String
		Collections.sort(list1);
		System.out.println(list1);

	}

}

