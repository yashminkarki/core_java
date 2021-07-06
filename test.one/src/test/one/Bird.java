package test.one;

public class Bird {
		String name = "";
		String color = "";
		int eyes, age;
		public Bird() {
			name = "Bird1";
			color = "Yellow";
			eyes = 2;
			age = 10;
		}
		public Bird (String n, String c, int e, int a) {
			name = n;
			color = c;
			eyes = e;
			age = a;
		}
		public Bird(String i, String b){
			name = i;
			color = b;
		}
		public Bird(String i) {
			name = i;
		}
		public Bird(String n, int i, int j, String p) {
			name = n; 
			eyes = i;
			age = j;
			color = p;
		}
		public void printData() {
			System.out.println("Name: " + name);
			System.out.println("Color: " + color);
			System.out.println("Age: " + age);
			System.out.println("eyes: " + eyes);
			
		}
		public void methodEat() {
			System.out.println("I'm eating food.");
		}
		public static void main(String[] args) {
			Bird b1 = new Bird();
			b1.printData();
			b1.methodEat();
			
			System.out.println("-------------------------");
			Bird b2 = new Bird("Bird2" , 2, 30, "black");
			b2.printData();
			b2.methodEat();
			
			System.out.println("-------------------------");
			Bird b3 = new Bird("Bird3" , "white" , 2, 20);
			b3.printData();
			b3.methodEat();
		}

	}

