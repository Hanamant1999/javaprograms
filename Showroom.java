class ShowRoom{
	
	public String name;
	public String type;
	public int availableStock;
	
	public ShowRoom(String name,String type,int availableStock){
		
		this.name=name;
		this.type=type;
		this.availableStock=availableStock;
		
		System.out.println(name + " " + type + " " + availableStock);
		
		System.out.println("----------------------------------------------------------------------");
	}
	
	public static void main(String a[]){
		
		ShowRoom showRoom = new ShowRoom("Maruti Suzuki ARENA","cars",500);
		ShowRoom showRoom1 = new ShowRoom("Bajaj Showroom","Two wheelers",20);
		ShowRoom showRoom2 = new ShowRoom(" Renault ","cars",5000);
		ShowRoom showRoom3 = new ShowRoom("Mahindra Two Wheelers","Bikes",150);
		
	}
	
}
