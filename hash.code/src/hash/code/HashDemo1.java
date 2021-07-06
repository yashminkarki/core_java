package hash.code;

public class HashDemo1 {

	public static void main(String[] args) {
		HashDemoSuper d1 = new HashDemoSuper(4,"Tommy");
		System.out.println(d1.hashCode());
		
		HashDemoSuper d2 = new HashDemoSuper(3,"Jocky");
		System.out.println(d2.hashCode());
		
		HashDemoSuper d3 = new HashDemoSuper(4,"Tommy");
		System.out.println(d3.hashCode());
		
//		511833308
//		1297685781
//		1705929636
		//after overriding hash code in HashDemoSuper class
//		80991899
//		71746986
//		80991899
		

	}

}

class HashDemoSuper{
	int age;
	String name;
	public HashDemoSuper(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public HashDemoSuper() {
		super();
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashDemoSuper other = (HashDemoSuper) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}