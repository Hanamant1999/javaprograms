package com.xworkz.daocollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDAO {

private Collection<String>  pg = new ArrayList<String>();
	
	public boolean save(String gymName)
	{
		return pg.add(gymName);
		
	}
	public boolean find(String gymName) {
		return pg.contains(gymName);
	}
	public boolean findByCaseInsensitive(String gymName) {
		
    Iterator<String> itr =pg.iterator();
    while(itr.hasNext()) {
    	String tempLocation = itr.next();
    	if(tempLocation.equalsIgnoreCase(gymName))
    	{
    		return true;
    		
    	}
		}
              return false;
	}
	public boolean findByCaseInSensitiveAndTrimed(String gymName) {
		  Iterator<String> itr =pg.iterator();
		    while(itr.hasNext()) {
		    	String tempLocation = itr.next();
		    	tempLocation = tempLocation.replace(" ", "");
		    	
		    	if(tempLocation.equalsIgnoreCase(gymName))
		    	{
		    		return true;
		    		
		    	}
				}
		    
		    return false;
	}

}
