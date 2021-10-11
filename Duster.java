class Duster{
	

	private static Duster duster =null; //  Duster is non-primitive datatype 
	
	
	
	public static Duster getDuster(){  //Duster is return type 
		return duster;
	}
	
	static{
		duster = new Duster();
		
	}
	
}
	
	
