package com.xworkz.collection.Interface;

public class SvaagatInstitute {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Institute ins = new Institute();
		ins.setFounderName("Omakar");
		ins.setHrName("Akshara");
		ins.setLocaton("Rajajinagar");
		ins.setName("X-Workz");
		
		Object obj = ins.clone();
		Institute ins1 = (Institute)obj;
		System.out.println(ins1.toString());
	}
}
