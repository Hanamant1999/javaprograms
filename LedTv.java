class LedTv{
	
	public static LedTv led = null;

	public static LedTv getLedTv(){
		
		return led;
	}
	
	static{
		
		led = new LedTv();
	}
}
	
