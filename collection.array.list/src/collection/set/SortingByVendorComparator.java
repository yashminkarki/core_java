package collection.set;

import java.util.Comparator;

public class SortingByVendorComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile arg0, Mobile arg1) {
		int i = (arg0.getVendor()).compareTo(arg1.getVendor());
		return i;
	}

}
