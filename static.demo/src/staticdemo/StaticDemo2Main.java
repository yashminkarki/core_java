package staticdemo;

public class StaticDemo2Main {

	public static void main(String[] args) {
		StaticDemo2 mv1 = new StaticDemo2("Nokia","Pink");
		mv1.info();
		StaticDemo2 mv2 = new StaticDemo2("Samsung","Blue");
	
		mv1.info();
		System.out.println(" ----------------------------- ");		
		mv2.info();
		StaticDemo2 mv3 = new StaticDemo2("Blackberry","Yellow");
		mv3.info();
		mv1.info();
		
	}

}

