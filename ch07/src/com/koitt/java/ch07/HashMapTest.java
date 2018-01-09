package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		//HashMap을 이용해서 키와 값이 모두 문자열을 허용하는 Map을 만들기 위한 문장
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("대한민국", "서울");
		hm.put("일본", "동경");
		hm.put("중국", "북경");
		hm.put("태국", "방콕");
		hm.remove("태국", "방콕");
		hm.put("중국", "북경");
		
		System.out.println("키 : " + hm.keySet());
		System.out.println(" 값 : " + hm.values());
		
		Iterator<String> keys = hm.keySet().iterator();
		while ( keys.hasNext());
			String key = keys.next();
			String value = hm.get(key);
			System.out.println(key + ": " + value);
	}
}
