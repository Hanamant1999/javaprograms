package com.xworkz.mapinterface.HashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContryBeginer {
 public static void main(String[] args) {
	
	 Map<Integer, String> map = new HashMap<Integer,String>();
	 
			   map.put(91, "India");
				map.put(93, "Afghanistan");
				map.put(54, "Argentina");
				map.put(55, "Brazil");
				map.put(95, "Myanmar");
				map.put(855, "Cambodia");
				map.put(20, "Egypt");
				map.put(353, "Ireland");
				
				Integer size = map.size();
				System.out.println(size);
				
				String check = map.get(91);
				String check1 = map.get(93);
				
				System.out.println(check);
				System.out.println(check1);
				
				boolean check3 =  map.containsKey(91);
				check3 = map.containsValue("India");
				System.out.println(check3);
				
		        Set<Integer> set1 = map.keySet();
				System.out.println(set1);
				
				Set<java.util.Map.Entry<Integer, String>> entry = map.entrySet();
				System.out.println(entry);
				
				
				
				
		}
		}
		



