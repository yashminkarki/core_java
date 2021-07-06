package superKeyword;

class SuperKeywordVariable {
	String name = "Dipesh";
	String color = "white";
	
	public void show() {
		System.out.println("name=" +name);
		System.out.println("color=" +color);
	}

}
class SuperKeyword2Sub extends SuperKeywordVariable{
	String color = "pink";
	String name = "Yashmin";
	
	public void show() {
		System.out.println("name=" +name);
		System.out.println("this.name=" +this.name);
		System.out.println("color=" +color);
		System.out.println("this.color=" +this.color);
		System.out.println("super.color=" +super.color);
		
		System.out.println("******************");
		//calling super class method
		super.show();
		
	}
}
