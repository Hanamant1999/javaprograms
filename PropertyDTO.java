class PropertyDTO{
	
	
	private String propertyHolderName;
	private String location;
	private String propertyNumber;
	
	
	public void setProprtyHolderName(String propertyHolderName){
		
		this.propertyHolderName=propertyHolderName;
	}
	public void setLocation(String location){
		
		this.location = location;
	}
	public void setPropertyNumber(String propertyNumber){
		
		this.propertyNumber=propertyNumber;
	}
	
	public String getProprtyHolderName(){
		
		return propertyHolderName;
	}
	public String getLocation(){
		
		return location;
	}
	public String getPropertyNumber(){
		
		return propertyNumber;
	}		
	
	
}