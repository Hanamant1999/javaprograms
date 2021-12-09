package com.xworkz.functonalinterface.functionalinterface;

public class ByIn implements IMyEmail{

	@Override
	public boolean verify(String str1, String str2) {
		System.out.println(". in Verification ");
		
		String s = str1.substring(str1.length()-3, str1.length());
		if(s.equals(str2)) {
			return  true;
		}
		return false;
	}
}
