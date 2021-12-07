package com.xworkz.daocollection;

public class SvaagatPg {

	public static void main(String[] args) {
	
            PgDAO dao = new PgDAO();
            
            dao.save("Navrang Rajajinagar");
            dao.save(" Gayatrinagar Rajajinagar");
            dao.save("Prakashnagar Rajajinagar");
            dao.save("Dobbigat Circle");
            
            
            boolean found=dao.find("Navrang Rajajinagar");
            
            System.out.println(found);
            
            boolean found1=dao.findByCaseInsensitive("navrang Rajajinagar");
            
            System.out.println(found1);
            
            boolean found3 =dao.findByCaseInSensitiveAndTrimed("Navrangrajajinagar");
            
            System.out.println(found3);
            
	}

}
