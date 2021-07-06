package collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable map1 = new Hashtable();
		map1.put("900", "Jdbc");
		map1.put("800", "Sql");
		map1.put("300", "Database");
		map1.put("400", "Java");
		map1.put("500", "Eclipse");
		map1.put("500", "Eclipse");
		
		String old = (String) map1.put("400", "Php");
		
		System.out.println("old = "+old);
		
		Set<Map.Entry<String,String>> entries = map1.entrySet();
		for(Map.Entry<String,String> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("-------------------");
		

	}

}
