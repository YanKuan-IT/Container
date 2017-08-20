package yk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * Array读快改慢
 * Linked改快读慢
 * Hash两者之间
 */
public class TestList {
	public static void main(String[] args) {
		List list = new LinkedList();
		
		for (int i = 0; i < 10; i++) {
			// 向列表的尾部添加指定的元素
			list.add("a"+i);
		}
		
		System.out.println(list);	// [a0, a1, a2, a3, a4, a5, a6, a7, a8, a9]
		// 在列表的指定位置插入指定元素
		list.add(5, 100);
		// 用指定元素替换列表中指定位置的元素
		list.set(6, 1);
		System.out.println(list);	// [a0, a1, a2, a3, a4, 100, 1, a6, a7, a8, a9]
		// 返回列表中指定位置的元素
		System.out.println(list.get(1));	// a1
		// 返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1
		System.out.println(list.indexOf(1));// 6
		// 移除列表中指定位置的元素
		list.remove(5);
		list.remove(5);
		System.out.println(list);	// [a0, a1, a2, a3, a4, a6, a7, a8, a9]
		
		
		
		
		list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			// 向列表的尾部添加指定的元素
			list.add("a"+i);
		}
		// 使用默认随机源对指定列表进行置换
		Collections.shuffle(list);
		System.out.println(list);	// [a0, a1, a5, a9, a3, a6, a7, a4, a8, a2]
		// 根据元素的自然顺序 对指定列表按升序进行排序
		Collections.sort(list);
		System.out.println(list);	// [a0, a1, a2, a3, a4, a5, a6, a7, a8, a9]
		// 反转指定列表中元素的顺序
		Collections.reverse(list);
		System.out.println(list);	// [a9, a8, a7, a6, a5, a4, a3, a2, a1, a0]
		
		Collections.sort(list);
		System.out.println(list);
		// 使用二分搜索法搜索指定列表，以获得指定对象-------------(没有排序的序列不能使用折半查找)
		System.out.println("a1:"+Collections.binarySearch(list, "a1")); // a1:1
	}
}
