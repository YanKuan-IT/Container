package yk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("hello");
		set.add("hello2");
		set.add("hello3");
		
		System.out.println(set);	// [hello2, hello, hello3]
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
		
		
		System.out.println("========================================");
		
		
		
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		
		set1.add("a");
		set1.add("b");
		set1.add("c");
		
		set2.add("c");
		set2.add("d");
		set2.add("e");

		Set set3 = new HashSet(set1);
		set3.retainAll(set2);		// 求交集
		System.out.println(set3);	// [c]
		
		Set set4 = new HashSet(set2);
		set4.addAll(set2);			// 求并集
		System.out.println(set4);	// [c, d, e]
		
	}
}
