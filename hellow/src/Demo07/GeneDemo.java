package Demo07;

import java.util.ArrayList;
import java.util.Collection;

public class GeneDemo {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		Student s=new Student();
		s.setName("林青霞");
		System.out.println(s.getName());
		
		Daneric<String> d1=new Daneric<String>();
		d1.setT("林青霞");
		System.out.println(d1.getT());
		d1.show("泛型");
		
		Daneric<Integer> d2=new Daneric<Integer>();
		d2.setT(30);
		System.out.println(d2.getT());
		
		fangfa f=new fangfa();
		f.show("林青霞");
		System.out.println(f.show("泛型返回值"));
		
		Denericimpl<String> j=new Denericimpl<String>();
		j.show("泛型接口");
		
		Denericimpl<Integer> j2=new Denericimpl<Integer>();
		j2.show(33);
		

		
	}
}
