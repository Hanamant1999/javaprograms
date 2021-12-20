package com.xworkz.mapinterface.HashMap.Section2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MovieAndRatings {
public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("karnataka", 31);
		map.put("Tamilnadu", 38);
		map.put("Uttar pradesh", 71);
		map.put("sikkim", 4);
		map.put("Maharastra", 36);
		map.put("Nagaland", 12);
		map.put("Punjab", 23);
		map.put("MadyaPradesh", 55);
		map.put("AndraPradesh", 13);
		map.put("Goa", 4);
		
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
	
	map1.put("karnataka", 31);
	map1.put("Tamilnadu", 38);
	map1.put("Uttar pradesh", 71);
	map1.put("sikkim", 4);
	map1.put("Maharastra", 36);
	map1.put("Nagaland", 12);
	map1.put("Punjab", 23);
	map1.put("MadyaPradesh", 55);
	map1.put("AndraPradesh", 13);
	map1.put("Goa", 4);
	
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
	
 	map2.put("karnataka", 31);
 	map2.put("Tamilnadu", 38);
 	map2.put("Uttar pradesh", 71);
 	map2.put("sikkim", 4);
 	map2.put("Maharastra", 36);
 	map2.put("Nagaland", 12);
 	map2.put("Punjab", 23);
 	map2.put("MadyaPradesh", 55);
 	map2.put("AndraPradesh", 13);
 	map2.put("Goa", 4);
 	
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
