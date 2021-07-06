package getter.setter;
import java.lang.reflect.Method;

public class GetterSetterDemo2Main {	

	public static void main(String[] args) throws Exception{
		
		Class c = Class.forName("GetterSetterDemo2");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("message", null);
		m.setAccessible(true);
		m.invoke(o, null);
		
		

	}

}
