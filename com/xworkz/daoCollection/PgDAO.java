package com.xworkz.collection.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class PgDAO {

	private Collection<String>  pg = new ArrayList<String>();
	
	public boolean save (String locaton)
	{
		return pg.add(locaton);
		
	}
	public boolean find(String location) {
		return pg.contains(location);
	}
	public boolean findByCaseInsensitive(String location) {
		
    Iterator<String> itr =pg.iterator();
    while(itr.hasNext()) {
    	String tempLocation = itr.next();
    	if(tempLocation.equalsIgnoreCase(location))
    	{
    		return true;
    		
    	}
		}
              return false;
	}
	public boolean findByCaseInSensitiveAndTrimed(String location) {
		  Iterator<String> itr =pg.iterator();
		    while(itr.hasNext()) {
		    	String tempLocation = itr.next();
		    	tempLocation = tempLocation.replace(" ", "");
		    	
		    	if(tempLocation.equalsIgnoreCase(location))
		    	{
		    		return true;
		    		
		    	}
				}
		    
		    return false;
	}
}
