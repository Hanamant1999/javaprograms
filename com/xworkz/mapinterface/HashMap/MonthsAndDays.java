package com.xworkz.mapinterface.HashMap.Section2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MonthsAndDays {

public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("January", 31);
		map.put("February", 28);
		map.put("March", 31);
		map.put("April", 30);
		map.put("May", 31);
		map.put("June", 30);
		map.put("July", 31);
		map.put("August", 30);
		map.put("Septmber", 31);
		map.put("October", 30);
		map.put("November", 31);
		map.put("December", 30);
		
	System.out.println(" ==================Looping Only Keys ==================");
	Set<String>  set1 =map.keySet();
	set1.forEach((e)->System.out.println(e + " " + map.get(e)));
	
	System.out.println(" ==================Looping Only values ==================");
         Collection<Integer> set2 =  map.values();
         set2.forEach((e)->System.out.println(e));
     
     System.out.println(" ==================Looping entry set using iterator ==================");
     Set<Map.Entry<String,Integer>> set3 = map.entrySet();
     
     Iterator<Map.Entry<String, Integer>> itr = set3.iterator();
     
     while(itr.hasNext()) {
    	 
    	 Map.Entry<String, Integer> entry =  itr.next();
    	 System.out.println(entry.getKey());
    	 System.out.println(entry.getValue());
    	 
    	 
     }
   
    
 	Map<String, Integer> map1 = new TreeMap<>((e1,e2)->e1.compareTo(e2));
	
 	map1.put("January", 31);
	map1.put("February", 28);
	map1.put("March", 31);
	map1.put("April", 30);
	map1.put("May", 31);
	map1.put("June", 30);
	map1.put("July", 31);
	map1.put("August", 30);
	map1.put("Septmber", 31);
	map1.put("October", 30);
	map1.put("November", 31);
	map1.put("December", 30);
	
	System.out.println(" ==================Looping Only Keys in decending order with tree map ==================");
     
	Set<String> set4 =  map1.keySet();
    set4.forEach((e)->System.out.println(e + " " + map1.get(e)) );
	

    System.out.println(" ==================Looping entry in desending  set using iterator with Tree set ==================");
    Set<Map.Entry<String,Integer>> set6 = map1.entrySet();
    
    Iterator<Map.Entry<String, Integer>> itr1 = set6.iterator();
    
    while(itr1.hasNext()) {
   	 
   	 Map.Entry<String,  Integer> entry1 =  itr1.next();
   	 System.out.println(entry1.getKey());
   	 System.out.println(entry1.getValue());
     
    }
   	 
   	 System.out.println(" ==================Tree set  in Asending order ==================");
	
 	Map<String, Integer> map2 = new TreeMap<>((e1,e2)->e2.compareTo(e1));
	
 	map2.put("January", 31);
	map2.put("February", 28);
	map2.put("March", 31);
	map2.put("April", 30);
	map2.put("May", 31);
	map2.put("June", 30);
	map2.put("July", 31);
	map2.put("August", 30);
	map2.put("Septmber", 31);
	map2.put("October", 30);
	map2.put("November", 31);
	map2.put("December", 30);
 	
 	System.out.println(" ==================Looping Only Keys  in asending order with tree map ==================");
      
 	Set<String> set31 =  map2.keySet();
     set31.forEach((e)->System.out.println(e + " " + map2.get(e)) );
 	

     System.out.println(" ==================Looping entry in asending  set using iterator with Tree set ==================");
     Set<Map.Entry<String,Integer>> list  = map2.entrySet();
     
     Iterator<Map.Entry<String, Integer>> itr2 = list.iterator();
     
     while(itr2.hasNext()) {
    	 Map.Entry<String,  Integer> entry2=  itr2.next();
    	 System.out.println(entry2.getKey());
    	 System.out.println(entry2.getValue());
    }

}

}
