package collection.map;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map1 = new LinkedHashMap<>();
		map1.put("500","Daffodil");
		map1.put("100","Tulip");
		map1.put("200","Lily");
		map1.put("300","Dahlia");
		map1.put("400","Daisy");
		map1.put(null, "P");
		
		System.out.println(map1);
		
		System.out.println("---------");
		String oldValue = map1.put("100", "Orchids");
		//map1.put("100","Orchids");
		System.out.println(map1);
		System.out.println(oldValue);
		
		//iteration
		Set<Map.Entry<String, String>> entries = map1.entrySet();
		for(Map.Entry<String, String> entry: entries) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());}
		
		System.out.println("---------");	
			
		Set<String> keys = map1.keySet();
		for(String key: keys) {
			System.out.println(key + " " + map1.get(key));
		
		}
		System.out.println("---------");
		System.out.println(map1.values());
		System.out.println(map1.keySet());
		System.out.println(map1.entrySet());
		
	}

	}
