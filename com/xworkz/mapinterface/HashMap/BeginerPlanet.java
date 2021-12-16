package com.xworkz.mapinterface.HashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BeginerPlanet {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Mercury");
		map.put(2, "Venus");
		map.put(3, "Earth");
		map.put(4, "Mars");
		map.put(5, "Saturn");
	   
		String check = map.get(1);
		System.out.println(check);
		
		boolean contain1 = map.containsKey(3);
		System.out.println(contain1);
		
		contain1 = map.containsValue("Earth");
		System.out.println(contain1);
		
		Set<Integer> set1 = map.keySet();
		System.out.println(set1);
		
		Set<java.util.Map.Entry<Integer, String>> set2 = map.entrySet();
		System.out.println(set2);
		
		
		
	}
}
