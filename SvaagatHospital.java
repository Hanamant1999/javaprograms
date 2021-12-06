package com.xworkz.collection.Interface;

public class SvaagatHospital {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Hospital hospital = new Hospital();
		
		hospital.setLocation("Bangalore");
		hospital.setName("Manipal Hospital");
		hospital.setNoOfDoctors(45);
		
		Object obj = hospital.clone();
		Hospital hospital1 =(Hospital)obj;
		System.out.println(hospital1.toString());
	}
}
