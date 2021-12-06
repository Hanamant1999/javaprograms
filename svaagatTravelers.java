package com.xworkz.collection.Interface;

public class svaagatTravelers {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Travelers travelers = new Travelers();
		travelers.setNoOfBranches(931);
		travelers.setNoOfBuses(1550);
		travelers.setTravelersName("VRL Travels");
		
		Object obj = travelers.clone();
		Travelers travelers1 = (Travelers)obj;
		System.out.println(travelers1.toString());
	}

}
