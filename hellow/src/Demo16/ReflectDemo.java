package Demo16;

import java.lang.reflect.Constructor;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub

//		Class<Student> c1=Student.class;
//		System.out.println(c1);
//		
//		Student s=new Student();
//		Class<? extends Student> c3=s.getClass();
//		
//		
//		Class<?> c4=Class.forName("Demo16.Student");
//		System.out.println(c4);
		
		Class<?> c=Class.forName("Demo16.Student");
		Constructor<?>[] cons=c.getDeclaredConstructors();
		for(Constructor con:cons) {
			System.out.println(con);
		}
		System.out.println("-------");
	}

}
