package Demo07;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "ղ�ݸ�");
		map.put("name", "��ɽ");
		System.out.println(map);
		HashMap<Integer, String> Sites = new HashMap<Integer, String>();
		// ��Ӽ�ֵ��
		Sites.put(1, "Google");
		Sites.put(2, "Runoob");
		Sites.put(3, "Taobao");	
		Sites.put(4, "Zhihu");
		// ��� key �� value
		for (Integer i : Sites.keySet()) {
			System.out.println("key: " + i + " value: " + Sites.get(i));
		}
		// �������� value ֵ
		for (String value : Sites.values()) {
			// ���ÿһ��value
			System.out.print(value + ", ");
		}

	}

}
