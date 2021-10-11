class Projector{
	
	public static Projector projector = null;
	
	public static Projector getProjector(){
		
		return projector;
	}
	
	static{
		
		projector = new Projector();
	}
}
