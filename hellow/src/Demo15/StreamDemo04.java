package Demo15;

import java.util.ArrayList;

public class StreamDemo04 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("����ϼ");
		list.add("������");
		list.add("������");
		list.add("���޼�");
		list.add("����");
		
		list.stream().sorted().forEach(System.out::println);
		System.out.println("--------");
		list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
	}
}
