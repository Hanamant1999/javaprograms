package com.xworkz.mapinterface.HashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AadharBeginer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Long, String> map = new HashMap<Long,String>();
		
		map.put(411157336884L, "Hanamnat Bandivaddar");
		map.put(421156895214L, "Ngaraj Choudapur");
		map.put(653285645211L, "ramangound Patil");
		map.put(546258642563L, "Girish Rathod");
		
		String check = map.get(411157336884L);
		System.out.println(check);
		
		boolean contain = map.containsKey(411157336884L);
		System.out.println(contain);
		
		boolean contain1 = map.containsValue( "Girish Rathod");
		System.out.println(contain1);
		
	   Set<Long> check1 = map.keySet();
	   check1.forEach((e)->System.out.println(e));

	   Set<java.util.Map.Entry<Long, String>> check2 = map.entrySet();
		check2.forEach((e)-> System.out.println(e));
	   
	 
		
	}
}
