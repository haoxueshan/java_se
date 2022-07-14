package Demo15;

import java.util.ArrayList;

public class StreamDemo05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		
		//list.stream().map(Integer::parseInt).forEach(System.out::println);
		//list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
		int resuit=list.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(resuit);
	}
}
