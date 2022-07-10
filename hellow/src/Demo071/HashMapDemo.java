package Demo071;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Student> hm=new HashMap<String,Student>();
		
		Student s1=new Student("张曼玉", 30);
		Student s2=new Student("林青霞", 20);
		Student s3=new Student("王祖贤", 30);
		hm.put("一", s1);
		hm.put("二", s1);
		hm.put("三", s1);
		
		Set<String> keyset=hm.keySet();
		for(String key:keyset) {
			Student value = hm.get(key);
			System.out.println(key+","+value.getName()+","+value.getAge());
		}
		
	}
}
