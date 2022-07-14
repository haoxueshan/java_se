package Demo161;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c=Class.forName("Demo16.Student");
		Constructor<?> con = c.getDeclaredConstructor(String.class);
		
		con.setAccessible(true);
		
		Object obj = con.newInstance("¡÷«‡œº");
		System.out.println(obj);
	}
}
