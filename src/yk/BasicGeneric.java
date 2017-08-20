package yk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class BasicGeneric {
	public static void main(String[] args) {
		
		int i1=1;
		Integer i2 = 1;
		if (i1==i2) {
			System.out.println("=======================");
		} else {
			System.out.println("-----------------------");
		}
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			System.out.println(string);
		}
		
		Collection<String> list2 = new HashSet<String>();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		Iterator<String> iterator = list2.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
		
		
	}
}


