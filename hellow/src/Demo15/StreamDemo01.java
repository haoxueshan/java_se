package Demo15;

import java.util.ArrayList;

public class StreamDemo01 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("����ϼ");
		list.add("������");
		list.add("������");
		list.add("���޼�");
		list.add("����");
		
		list.stream().filter(s->s.startsWith("��")).forEach(System.out::println);
		System.out.println("--------");
		list.stream().filter(s->s.length()==3).forEach(System.out::println);
		System.out.println("--------");
		list.stream().filter(s->s.startsWith("��")).filter(s->s.length()==3).forEach(System.out::println);
	}
}
