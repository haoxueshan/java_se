package Demo15;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
//		ArrayList<String> list=new ArrayList<String>();
//		list.add("林青霞");
//		list.add("张曼玉");
//		list.add("王祖贤");
//		
////		ArrayList<String> zhangList=new ArrayList<String>();
////		for(String s:list) {
////			if(s.startsWith("张")) {
////				zhangList.add(s);
////			}
////		}
////		System.out.println(zhangList);
//		list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
		
		List list=new ArrayList<String>();
		Stream<String> listStream=list.stream();
		
		Set<String> Set=new HashSet<String>();
		Stream<String> setStream=Set.stream();
		
		Map<String,Integer> map=new HashMap<>();
		Stream<String> keyStream=map.keySet().stream();
		Stream<Integer> valueStream=map.values().stream();
		Stream<Map.Entry<String,Integer>> entryStream=map.entrySet().stream();
		
		String[] strArray={"hello","world","java"};
		Stream<String> strArrayStream=Stream.of(strArray);
		Stream<String> strArrayStream2=Stream.of("hello","world","java");
		Stream<Integer> intStream=Stream.of(10,20,30);
		
		}
		
	}

