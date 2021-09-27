class Resturent{
	
	public int resturentId;
	public String resturentName;
	public String type;
	public String location;
	
	
	public Resturent(int Id,String name,String types,String address){  // construstor 
	
		System.out.println("Resturent object is created ");
		resturentId=Id;
		resturentName=name;
		type=types;
	     location=address;
		
		
	}
	
	public void serveFood(){
		
		System.out.println("Serving food with delicious items ");
		
	}
	
	public void displayDetails(){
			System.out.println(resturentId +" "+resturentName+" "+type +"  "+location);

			
}
}
		
	