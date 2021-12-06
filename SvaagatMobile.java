package com.xworkz.collection.Interface;

public class SvaagatMobile {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Mobile mobile = new Mobile();
		mobile.setName("Redmi Note 6 Pro");
		mobile.setPrieze(14500);
		mobile.setRam(4);
		mobile.setRom(64);
		
		Object obj = mobile.clone();
		Mobile mobile1 = (Mobile)obj;
		System.out.println(mobile1.toString());
	}
}
