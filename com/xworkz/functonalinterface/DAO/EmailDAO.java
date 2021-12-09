package com.xworkz.functonalinterface.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functonalinterface.functionalinterface.IMyEmail;

public class EmailDAO {

	
	Collection<String> email = new ArrayList<>();
	
	public boolean save(String mail) {
		return email.add(mail);
		
	}
	public boolean find(IMyEmail imail, String umail) {
		
		  Iterator<String> itr =email.iterator();
		    while(itr.hasNext()) {
		    	String tempMail= itr.next();
		    	if(imail.verify(tempMail,umail))
		    	
		    	{
		    		return true;
		    		
		    	}
				}
		return false;
	}
}
