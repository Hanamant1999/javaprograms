package com.xworkz.collection.Interface;

public class svaagatBottle {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Bottle bottle = new Bottle();
		bottle.setName("Aqualink");
		bottle.setQuantity(" 1 Litre");
		bottle.setRate(20);
		
    Object obj = bottle.clone(); 
    
    Bottle bottle1 = (Bottle) obj;
    System.out.println(bottle1.getName());
    System.out.println(bottle.toString());
    System.out.println(bottle1.toString());
    
	}
}
