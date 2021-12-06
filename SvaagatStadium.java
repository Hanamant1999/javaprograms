package com.xworkz.collection.Interface;

public class SvaagatStadium {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Stadium stadium = new Stadium();
		stadium.setLocation("Bangalore");
		stadium.setName("Chinnaswamy Stadium");
		stadium.setNoOfSeats(40000);
		
		Object obj = stadium.clone();
		
		Stadium stadium1 = (Stadium)obj;
		System.out.println(stadium1.toString());
	}
}
