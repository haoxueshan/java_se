package Demo161;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c=Class.forName("Demo16.Student");
		//Field[] fields = c.getFields();
		Field[] fields = c.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field);
		}
		System.out.println("---------");
		
		Field addressField=c.getField("address");
		Constructor<?> conr = c.getConstructor();
		Object obj = conr.newInstance();
		addressField.set(obj, "Î÷°²");
		
		System.out.println(obj);
	}
}
