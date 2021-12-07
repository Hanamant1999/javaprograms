package com.xworkz.collection.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplTeamDAO {

	Collection<String>  ipl = new ArrayList<>();
	
	public boolean save(String iplTeamName) {
		
		return ipl.add(iplTeamName);
 		
	}
	
	public boolean find(String iplTeamName)
	{
		return ipl.contains(iplTeamName);
	}
	public boolean find1(String iplTeamName) {
		       
				Iterator<String> itr = ipl.iterator();
				
				while(itr.hasNext()) {
					
					String tempName=itr.next();
					
					if(tempName.equalsIgnoreCase(iplTeamName))
					{
						return true;
					}
				}
				return false;
	}
	
	public boolean find2(String iplTeamName) {
		
		Iterator<String> itr = ipl.iterator();
		
		while(itr.hasNext()) {
			
			String tempName=itr.next();
			tempName = tempName.replace(" ", "");
			if(tempName.equalsIgnoreCase(iplTeamName))
			{
				return true;
			}
		}
		return false;
	}
}
