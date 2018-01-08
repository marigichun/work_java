package com.koitt.java.ch07;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("pascal");			list.addLast(1);
		list.add("java");			list.addLast(3.4);
		list.addFirst("algol");		list.addLast(0.87);
		list.add("3, null");		list.addLast(5.8);
		
		Iterator it = list.iterator();
		print(it);
		print(list.descendingIterator());
		
		//배열로 반환하여 모드 원소 출력 가능
		for (Object e : list.toArray()) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void print(Iterator it) {
		
		
	}
}
