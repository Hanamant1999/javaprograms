class ZomatoDTO{

	private String name;
	private String location;
	private int idNumber;

	public String getname(){
		
		return name;
	}
	public String getlocation(){
		
		return location;
	}

	public int getid(){
		return idNumber;
		
	}

	public void setname(String name){
		
		this.name=name;
	}
	public void setlocation(String location){
		
		this.location=location;
	}

	public void setid(int idNumber){
		
		this.idNumber=idNumber;
		
	}
}