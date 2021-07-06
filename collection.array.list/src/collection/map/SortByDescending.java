package collection.map;

import java.util.Comparator;

public class SortByDescending implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		int x = arg1.compareTo(arg0);
		return x;
	}

}
