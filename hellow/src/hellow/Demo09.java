package hellow;

import java.util.ArrayList;

public class Demo09 {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		//System.out.println(array.add("hello"));
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println(array);
		
		array.add(1,"asd");
		System.out.println(array);
	}
}
