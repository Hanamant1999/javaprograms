package com.xworkz.functonalinterface.functionalinterface;

public class Bycom implements IMyEmail  {

	@Override
	public boolean verify(String str1, String str2) {
		System.out.println("Bycom  verification");
		String s = str1.substring(str1.length()-4, str1.length());
		if(s.equals(str2)) {
			return true;
		}
		return false;
		 
}
}

//  h   a   @   g   m  a   i   l   .  c   o  m
//  0    1    2  3    4   5   6  7  8 9   10  11

           