package Demo161;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c=Class.forName("Demo16.Student");
		Constructor<?> con = c.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("����ϼ",30,"����");
		System.out.println(obj);
		
	}
}
