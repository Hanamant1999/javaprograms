package com.xworkz.mapinterface.HashMap.Section2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BarAndBrands {

	
public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("The Underpass Pub & Grub", 90);
		map.put("Arbor Brewing Company", 85);
		map.put("Toit", 80);
		map.put("Skyye", 78);
		map.put("High Ultra Lounge", 74);
		map.put("Hoppipola", 50);
	
		
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
	
	map1.put("The Underpass Pub & Grub", 90);
	map1.put("Arbor Brewing Company", 85);
	map1.put("Toit", 80);
	map1.put("Skyye", 78);
	map1.put("High Ultra Lounge", 74);
	map1.put("Hoppipola", 50);
	
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
	
	map2.put("The Underpass Pub & Grub", 90);
	map2.put("Arbor Brewing Company", 85);
	map2.put("Toit", 80);
	map2.put("Skyye", 78);
	map2.put("High Ultra Lounge", 74);
	map2.put("Hoppipola", 50);
 	
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
