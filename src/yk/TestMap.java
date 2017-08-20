package yk;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashMap  TreeMap
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		System.out.println(map.size());
		System.out.println(map.containsKey("key1"));
		if (map.containsKey("key1")) {
			int a = map.get("key1");
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		
		Map map1 = new HashMap();
		Map map2 = new TreeMap();
//		map1.put("key", new Integer(1));
//		map2.put("key", new Integer(2));
//		map2.put("key2", new Integer(10));
		map1.put("key", 1);
		map2.put("key", 2);
		map2.put("key2", 10);
		
		System.out.println(map1.size());//1
		System.out.println(map2.size());//2
		// �����ӳ�����ָ������ӳ���ϵ���򷵻� true
		System.out.println(map1.containsKey("key"));//true
		// �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true
//		System.out.println(map2.containsValue(new Integer(2)));//true
		System.out.println(map2.containsValue(2));//true
		
		if(map2.containsKey("key")){
			// ����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null
			int integer = (Integer) map2.get("key");
			System.out.println(integer);//2
		}
		
		Map map3 = new HashMap(map1);
		// ��ָ��ӳ���н�����ӳ���ϵ���Ƶ���ӳ����
		map3.putAll(map2);
		System.out.println(map3); // {key2=10, key=2}
	}
}
