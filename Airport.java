class Airport{
	
	public static void main(String a[]){
		String[] domesticAirports=new String[5];
			domesticAirports[0]="Mysore Airport";
			domesticAirports[1]="Visakhapatnam Airport";
			domesticAirports[2]="New Delhi Airport";
			domesticAirports[3]="Bangalore Airport";
			domesticAirports[4]="Chennai Airport";
		
		String[] internationalAirports=new String[5];
		    internationalAirports[0]="Netaji Subhash Chandra Bose International Airport";
			internationalAirports[1]="Chennai International Airport";
			internationalAirports[2]="Thiruvananthapuram International Airport";
			internationalAirports[3]="Sardar Vallabh Bhai Patel International Airport";
			internationalAirports[4]="Amadabad International Airport";
		
		for(int i=0;i<domesticAirports.length;i++){
			
			System.out.println(domesticAirports[i]);
		}
		
		for(int i=0;i<domesticAirports.length;i++){
			
			System.out.println(internationalAirports[i]);
		}
			
	}	
}