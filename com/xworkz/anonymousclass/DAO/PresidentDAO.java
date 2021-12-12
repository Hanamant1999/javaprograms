package com.xworkz.anonymousclass.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.anonymousclass.Interface.*;
import com.xworkz.anonymousclass.DTO.PresidentDTO;

public class PresidentDAO {

	Collection  pres1 =  new ArrayList();
	
	public boolean save(PresidentDTO dto) {
		
		return pres1.add(dto);
	}
	
	public boolean find(IPresident ipre , String str) {
		
		Iterator<PresidentDTO> itr = pres1.iterator();
		
		while(itr.hasNext()	){
			
			PresidentDTO dto1 = itr.next();
			
			if( ipre.search(dto1, str)) {
				return true;
			}
		}
		return false;
	}


}
