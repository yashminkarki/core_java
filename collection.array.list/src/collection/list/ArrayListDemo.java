package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList();
		List<String> list = new ArrayList();
		list.add("Yashmin");
		list.add("Collection");
		list.add("Interface");
		list.add("Java");
		list.add("Iterables");
		
		//System.out.println(list);
		//System.out.println("---------------------");
		
		//iteration using for each loop
		
//		for(String abc:list) {
//			System.out.println(abc);
//		}
//		
//		System.out.println("--------------------");
//		
		//simple classical for each loop
//		for (int i =0; i<= list.size()-1;i++) {
//			System.out.println(list.get(i));
//		}
		
		//Using iterator interface
		//Collection framework provides another interface iterator. by using iterator you can iterate any collection
//		System.out.println("------Iterator------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
