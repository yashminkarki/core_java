package collection.list;

import java.util.ArrayList;

import java.util.Collections;


public class ArrayCollectionDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add("Yashmin");
		
		System.out.println(list);
		System.out.println("--------------");
		
		//ArrayList<String> list1 = new ArrayList();
		
		ArrayList<String> list1 = new ArrayList();
		list1.add("Java");
		list1.add("Yashmin");
		list1.add("eclipse");
		list1.add("Workspace");
		list1.add("Java");
	
		System.out.println(list1);
		
		System.out.println("--------------");
		
		ArrayList<Integer> list2 = new ArrayList();
		list2.add(13);
		list2.add(5);
		list2.add(9);
		list2.add(6);
		list2.add(10);
		list2.add(1);
		list2.add(2);
		System.out.println(list2);
		
		System.out.println("--------------");		
		ArrayList<Character> list3 = new ArrayList();
		list3.add('a');
		list3.add('i');
		list3.add('u');
		list3.add('e');
		list3.add('o');
		System.out.println(list3);
		
		System.out.println("--------------");	
		
		//search
		System.out.println(list3.contains('a'));
		System.out.println(list2.contains(15));
		
		//Sort the integer values
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("--------------");
		
		//Sort the String value
		
		Collections.sort(list3);
		System.out.println(list3);

	}

}

