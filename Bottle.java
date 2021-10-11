class Bottle{
	
	public static Bottle bottle = null;
	
	public static Bottle getBottle(){
		
		return bottle;
		
	}
	
	static{
		
		bottle = new Bottle();
		
	}
}

