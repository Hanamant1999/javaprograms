class Mobile{
	
	public static Mobile mobile = null;
	
	public static Mobile getMobile(){
		
		return mobile;
	}
	
	static{
		
		
		mobile = new Mobile();
	}
}