package collection.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> map1 = new TreeMap<>(new SortByDescending());
		map1.put("900", "Jdbc");
		map1.put("800", "Sql");
		map1.put("300", "Database");
		map1.put("400", "Java");
		map1.put("500", "Eclipse");
		map1.put("500", "Eclipse");
		map1.put("700", null);
		System.out.println(map1);
	
	}

}
