package com.xworkz.mapinterface.HashMap.Section2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AreaAndDimension {

public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Karanatak", 191791);
		map.put("Rajasthan", 342293);
		map.put("Gujarat", 196024);
		map.put("Uttarakhand", 53483);
		map.put("Punjab", 50362);
	    
	
		
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
	
	map1.put("Karanatak", 191791);
	map1.put("Rajasthan", 342293);
	map1.put("Gujarat", 196024);
	map1.put("Uttarakhand", 53483);
	map1.put("Punjab", 50362);
	
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
	
	map2.put("Karanatak", 191791);
	map2.put("Rajasthan", 342293);
	map2.put("Gujarat", 196024);
	map2.put("Uttarakhand", 53483);
	map2.put("Punjab", 50362);
 	
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