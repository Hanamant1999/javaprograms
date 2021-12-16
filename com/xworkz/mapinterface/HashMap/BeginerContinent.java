package com.xworkz.mapinterface.HashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BeginerContinent {
 public static void main(String[] args) {
	
	 Map<String, Integer> map = new HashMap<>();
	 
	 map.put("Africa",54 );
	 map.put("Europe",51 );
	 map.put("North America",23 );
	 
	 Integer check = map.get("North America");
	 System.out.println(check);
	 
	 boolean contain = map.containsKey("Africaa");
	 System.out.println(contain);
	 
	 boolean contain1 = map.containsValue(51);
	 System.out.println(contain1);
	 
	 Set<String> set1 = map.keySet();
	 System.out.println(set1);
	 
	 Set<java.util.Map.Entry<String, Integer>> set2 = map.entrySet();
	 System.out.println(set2);
	 
	 
	 
 }
}
