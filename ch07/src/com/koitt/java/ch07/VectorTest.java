package com.koitt.java.ch07;

import java.util.Vector;

public class VectorTest {
	
	    //제니릭(Generic):<>안의 코드를 유연하게 사용하기 위한
		public static void main(String[] args) {
		Vector<Object> data = new Vector<Object>(3);
		//Vector data = new Vector(3); //경고 발생
		data.addElement(2012);
		data.add("년도");		
		data.addElement(4.35);			
		data.add(2, "목표 학점");
		data.insertElementAt("자바강좌", 0);	//insertElementAt 자리에 위치한 값을 반환하라는
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + data.capacity());
		System.out.println(data.toString());
	}
}
