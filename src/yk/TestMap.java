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
		// 如果此映射包含指定键的映射关系，则返回 true
		System.out.println(map1.containsKey("key"));//true
		// 如果此映射将一个或多个键映射到指定值，则返回 true
//		System.out.println(map2.containsValue(new Integer(2)));//true
		System.out.println(map2.containsValue(2));//true
		
		if(map2.containsKey("key")){
			// 返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null
			int integer = (Integer) map2.get("key");
			System.out.println(integer);//2
		}
		
		Map map3 = new HashMap(map1);
		// 从指定映射中将所有映射关系复制到此映射中
		map3.putAll(map2);
		System.out.println(map3); // {key2=10, key=2}
	}
}
