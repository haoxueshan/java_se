package Demo15;

import java.util.ArrayList;

public class StreamDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("张曼玉");
		list.add("张起灵");
		list.add("张无忌");
		list.add("张敏");
		
		list.stream().limit(3).forEach(System.out::println);
		
		list.stream().skip(3).forEach(System.out::println);
		
		list.stream().skip(2).limit(2).forEach(System.out::println);
		
	}

}
