class Chair{
	
	public static Chair chair = null;
	
	public static Chair getChair(){
		
		return chair;
	}
	
	static{
		
		chair = new Chair();
	}
	
}
