package hash.code;

public class HashDemo3 {

	public static void main(String[] args) {
		HashDemoSuper3 d1 = new HashDemoSuper3(4,"Tommy");
		System.out.println(d1.hashCode());
		HashDemoSuper3 d2 = new HashDemoSuper3(6,"Jacky");
		System.out.println(d2.hashCode());
		HashDemoSuper3 d3 = new HashDemoSuper3(6,"Jacky");
		System.out.println(d3.hashCode());
	}

}

class HashDemoSuper3{
	int age;
	String name;
	public HashDemoSuper3(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public HashDemoSuper3() {
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
		HashDemoSuper3 other = (HashDemoSuper3) obj;
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