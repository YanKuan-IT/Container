package yk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * Array�������
 * Linked�Ŀ����
 * Hash����֮��
 */
public class TestList {
	public static void main(String[] args) {
		List list = new LinkedList();
		
		for (int i = 0; i < 10; i++) {
			// ���б��β�����ָ����Ԫ��
			list.add("a"+i);
		}
		
		System.out.println(list);	// [a0, a1, a2, a3, a4, a5, a6, a7, a8, a9]
		// ���б��ָ��λ�ò���ָ��Ԫ��
		list.add(5, 100);
		// ��ָ��Ԫ���滻�б���ָ��λ�õ�Ԫ��
		list.set(6, 1);
		System.out.println(list);	// [a0, a1, a2, a3, a4, 100, 1, a6, a7, a8, a9]
		// �����б���ָ��λ�õ�Ԫ��
		System.out.println(list.get(1));	// a1
		// ���ش��б��е�һ�γ��ֵ�ָ��Ԫ�ص�������������б�������Ԫ�أ��򷵻� -1
		System.out.println(list.indexOf(1));// 6
		// �Ƴ��б���ָ��λ�õ�Ԫ��
		list.remove(5);
		list.remove(5);
		System.out.println(list);	// [a0, a1, a2, a3, a4, a6, a7, a8, a9]
		
		
		
		
		list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			// ���б��β�����ָ����Ԫ��
			list.add("a"+i);
		}
		// ʹ��Ĭ�����Դ��ָ���б�����û�
		Collections.shuffle(list);
		System.out.println(list);	// [a0, a1, a5, a9, a3, a6, a7, a4, a8, a2]
		// ����Ԫ�ص���Ȼ˳�� ��ָ���б������������
		Collections.sort(list);
		System.out.println(list);	// [a0, a1, a2, a3, a4, a5, a6, a7, a8, a9]
		// ��תָ���б���Ԫ�ص�˳��
		Collections.reverse(list);
		System.out.println(list);	// [a9, a8, a7, a6, a5, a4, a3, a2, a1, a0]
		
		Collections.sort(list);
		System.out.println(list);
		// ʹ�ö�������������ָ���б��Ի��ָ������-------------(û����������в���ʹ���۰����)
		System.out.println("a1:"+Collections.binarySearch(list, "a1")); // a1:1
	}
}
