package com.xworkz.functonalinterface;

import com.xworkz.functonalinterface.DAO.EmailDAO;
import com.xworkz.functonalinterface.functionalinterface.ByIn;
import com.xworkz.functonalinterface.functionalinterface.Bycom;
import com.xworkz.functonalinterface.functionalinterface.IMyEmail;

public class SvaagatEmail {

	public static void main(String[] args) {
		
		EmailDAO em = new EmailDAO();
		em.save("hanamantbandivaddar48@gmail.com");
		em.save("hanamantbandivaddar.xworkz@gmail.in");
		em.save("hanamantbandivaddar7829@gmail.com");
		
		IMyEmail myEmail = new Bycom();
		
		boolean find = em.find(myEmail , ".com");
		System.out.println(find);
		
		IMyEmail myEmail1 = new ByIn();
		boolean find1 = em.find(myEmail1, ".in");
		System.out.println(find1);
	   
	}
}
