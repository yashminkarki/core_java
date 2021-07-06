package getter.setter;
import java.lang.reflect.Method;

class GetterSetterDemo1Main {

	public static void main(String[] args) throws Exception{
		GetterSetterDemo1 c = new GetterSetterDemo1();
		
		//Using getDeclaremethod() method
		Method m = GetterSetterDemo1.class.getDeclaredMethod("private_Method");
		//Using setAccessible() method
		m.setAccessible(true);
		
		//Using invoke method
		m.invoke(c);
		
		
	}

}
