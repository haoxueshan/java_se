package Demo141;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> array = new ArrayList<String>();
		array.add("cccc");
		array.add("aa");
		array.add("b");
		System.out.println("≈≈–Ú«∞" + array);

		Collections.sort(array, getComparator());
		System.out.println("≈≈–Ú∫Û" + array);
	}

	private static Comparator<String> getComparator(){
//		Comparator<String> comp=new Comparator<String>() {

//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.length()-o2.length();
//			}
//			return (String s1,String s2)->{
//				return s1.length()-s2.length();
		return (s1,s2)->s1.length()-s2.length();
//		};
//		return comp;
		
	}
}
