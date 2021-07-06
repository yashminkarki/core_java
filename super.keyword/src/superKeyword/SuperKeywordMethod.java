package superKeyword;

class SuperKeywordMethod {
	public void dance() {
		System.out.println("Joker can dance");	}
}

class SuperKeywordSub extends SuperKeywordMethod{
	public void dance() {
		System.out.println("Joker can dance in night only");
	}
	public void hey() {
		dance();
		super.dance();
	}
}