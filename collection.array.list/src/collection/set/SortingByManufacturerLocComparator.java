package collection.set;

import java.util.Comparator;

public class SortingByManufacturerLocComparator implements Comparator<Mobile>{

	@Override
	public int compare(Mobile arg0, Mobile arg1) {
		int i = (arg0.getManufacturerLoc()).compareTo(arg1.getManufacturerLoc());
		return i;
	}

}
