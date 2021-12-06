package com.xworkz.collection.Interface;

public class SvaagatPens {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Pens pen = new Pens();
		
		pen.setName("Writometer");
		pen.setColour("Bue");
		pen.setRate(5);
		
		
		Object obj = pen.clone();
		Pens pen1 = (Pens)obj;
		
		System.out.println(pen1.toString());
		
		
	}
}
