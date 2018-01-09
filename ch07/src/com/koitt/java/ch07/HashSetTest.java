package com.koitt.java.ch07;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> setA = new HashSet<Integer>();
		HashSet<Integer> setB = new HashSet<Integer>();
		
		setA.add(3); setA.add(5); setA.add(7);
		setA.add(8); setA.add(7); setA.add(9);
		System.out.println("A = ");
		print(setA);
		System.out.println(" A = " + setA);
		
		setA.add(5); setA.add(3); setA.add(2);
		System.out.println("B = ");
		print(setB);
		System.out.println(" B = " + setB);
		
		boolean isChanged = setA.removeAll(setB);
		System.out.println("A - b = ");
		if (isChanged) System.out.println(setA);;
				
	}

	public static void print(HashSet<Integer> s) {
		Iterator<Integer> i = s.iterator();
		while (i.hasNext() );
			System.out.println(i.next()+ " ");
		
	}
}