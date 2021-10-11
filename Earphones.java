class Earphones{
	
	public static Earphones earphones =  null;
	
	public static Earphones getEarphones(){
		
		return earphones;
	}
	
	static{
		
		earphones = new Earphones();
	}
}

