class Watch{
	
	public static Watch watch = null;
	
	public static Watch getWatch(){
		
		return watch;
	}
	
	static{
		
		watch =new Watch();
	}
	
}