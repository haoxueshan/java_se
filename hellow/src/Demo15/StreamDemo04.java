package Demo15;

import java.util.ArrayList;

public class StreamDemo04 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("张曼玉");
		list.add("张起灵");
		list.add("张无忌");
		list.add("张敏");
		
		list.stream().sorted().forEach(System.out::println);
		System.out.println("--------");
		list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
	}
}
