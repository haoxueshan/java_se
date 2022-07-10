package Demo07;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("名称", "詹妮弗");
		map.put("name", "张山");
		System.out.println(map);
		HashMap<Integer, String> Sites = new HashMap<Integer, String>();
		// 添加键值对
		Sites.put(1, "Google");
		Sites.put(2, "Runoob");
		Sites.put(3, "Taobao");	
		Sites.put(4, "Zhihu");
		// 输出 key 和 value
		for (Integer i : Sites.keySet()) {
			System.out.println("key: " + i + " value: " + Sites.get(i));
		}
		// 返回所有 value 值
		for (String value : Sites.values()) {
			// 输出每一个value
			System.out.print(value + ", ");
		}

	}

}
