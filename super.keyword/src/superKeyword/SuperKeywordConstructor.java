package superKeyword;


class SuperKeywordConstructor {
	String name = "Hero";
	
	public SuperKeywordConstructor() { //created by compiler
		
	}
	public void print() {
		System.out.println("name= "+name);
	}

}

class SuperKeywordConstructorSub extends SuperKeywordConstructor {
	String vendor = "Harsh";
	
	public SuperKeywordConstructorSub() {//created by compiler
		super();
	}
	
	public void show() {
		System.out.println("name= "+name);
		System.out.println("Vendor= "+vendor);
	}
	

}


