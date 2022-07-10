package Demo06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;



public class ListDemo {

	public static void main(String[] args) {
		
		
		Student st1=new Student("qwe",12);
		Student st2=new Student("asd",21);
		Student st3=new Student("zxc",32);
		Student st4=new Student("zxc",32);
		TreeSet<Student> te=new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student st1,Student st2) {
				int num=st1.getAge()-st2.getAge();
				int num2=  num==0?st1.getName().compareTo(st2.getName()):num;
				return num2;
			};
		});
		te.add(st1);
		te.add(st2);
		te.add(st3);
		te.add(st4);
		for(Student s:te) {
			System.out.println(s.getName()+s.getAge());
		}
		
		System.out.println("--------------------------");
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		for(String a:array) {
			System.out.println(a);
		}
		LinkedList<String> linked=new LinkedList<String>();
		linked.add("hello");
		linked.add("world");
		linked.add("java");
		for(String a:linked) {
			System.out.println(a);
		}
	}
	

 }

