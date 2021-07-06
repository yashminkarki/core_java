package nonaccessmodifier.demo;

class FinalDemo {
	final void m1() {
		System.out.println("This is final method.");
		
	}
	public void m2() {
		System.out.println("This is another method.");
	}

}
class FinalDemoSub extends FinalDemo{
	public void m2() {
		System.out.println("final method cant be overriden");
	}
}
