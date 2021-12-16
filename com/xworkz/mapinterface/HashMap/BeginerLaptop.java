package com.xworkz.mapinterface.HashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BeginerLaptop {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("HP", "RYzon");
		map.put("Lenova", "Intel");
		map.put("Acer", "Intel i3");
		
		String check = map.get("HP");
	    System.out.println(check);
	    
	    boolean contain = map.containsKey("Acer");
	    System.out.println(contain);
	    
	    boolean contain1 =map.containsValue("Intel");
	    System.out.println(contain1);
	    
	   Set<String> set1 = map.keySet();
	   System.out.println(set1);
     
	  Set<java.util.Map.Entry<String, String>> set2 = map.entrySet();
	  System.out.println(set2);
	  
	}
}
