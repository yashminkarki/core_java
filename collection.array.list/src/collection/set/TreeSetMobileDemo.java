package collection.set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetMobileDemo {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple", 1200, 2355,"Austin");
		Mobile m2 = new Mobile("Samsung", 1500, 1436,"Gretna");
		Mobile m3 = new Mobile("BlackBerry", 1000, 9044,"Kenner");
		Mobile m4 = new Mobile("Motorola", 11000, 8458,"Orlando");
		Mobile m5 = new Mobile("Nokia", 1555, 3847,"Tampa");
		
		Set<Mobile> mobiles = new TreeSet<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
		mobiles.add(m5);
		
		System.out.println(mobiles);
		System.out.println("**********************************");
		
		Set<Mobile> set= new TreeSet<Mobile>(new SortingByVendorComparator());
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		
		System.out.println(set);
		
		System.out.println("**********************************");
		
		Set<Mobile> set1= new TreeSet<Mobile>(new SortingByManufacturerLocComparator());
		set1.add(m1);
		set1.add(m2);
		set1.add(m3);
		set1.add(m4);
		set1.add(m5);
		
		System.out.println(set1);
		
		System.out.println("**********************************");
		
		Set<Mobile> set2= new TreeSet<Mobile>(new SortingByPinCodeComparator());
		set2.add(m1);
		set2.add(m2);
		set2.add(m3);
		set2.add(m4);
		set2.add(m5);
		
		System.out.println(set2);

	}

}
