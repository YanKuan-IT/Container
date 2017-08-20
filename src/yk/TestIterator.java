package yk;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		Collection collection = new HashSet();
		
		collection.add(new Integer(100));
		collection.add(new Integer(150));
		collection.add(new Integer(130));
		
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			int i = (int) iterator.next();
			System.out.print(i+"  ");	// 130  100  150  
		}
		
		System.out.println(collection);
		
		Iterator i = collection.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.print(integer+" ");
			i.remove();
		}
		
		System.out.println(collection);
	}	
}
