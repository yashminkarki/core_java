package collection.set;

import java.util.Comparator;

public class SortingByPinCodeComparator implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		int x = o1.getPinCode() - o2.getPinCode();
		return x;

	}

}
