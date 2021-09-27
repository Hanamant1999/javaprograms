class Stadiums{
	
	public String name;
	public String type;
	public int availableSeats;
	
	public Stadiums(String name, String type,int availableSeats){
		
		this.name=name;
		this.type=type;
		this.availableSeats=availableSeats;
		
		System.out.println(name+ " " +type+ " " +availableSeats);
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	public static void main(String a[]){
		
		Stadiums stadium = new Stadiums("Arun Jaitley Stadium","outdoor",	41820);
		Stadiums stadium1 = new Stadiums("Brabourne Stadium","outdoor",	20000);
		Stadiums stadium2 = new Stadiums("M. Chinnaswamy Stadium","outdoor",38000);
		Stadiums stadium3 = new Stadiums("Narendra Modi Stadium","outdoor",	132000);
		
	}
	
}