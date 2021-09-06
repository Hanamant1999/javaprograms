class Airport{
	
	
	static String[] domesticAirports=new String[5];
	static String[] internationalAirports=new String[5];
	
	public static void main(String a[]){
		
			domesticAirports[0]="Mysore Airport";
			domesticAirports[1]="Visakhapatnam Airport";
			domesticAirports[2]="New Delhi Airport";
			domesticAirports[3]="Bangalore Airport";
			domesticAirports[4]="Chennai Airport";
			
			getdomesticAirports();
			
	
		    internationalAirports[0]="Netaji Subhash Chandra Bose International Airport";
			internationalAirports[1]="Chennai International Airport";
			internationalAirports[2]="Thiruvananthapuram International Airport";
			internationalAirports[3]="Sardar Vallabh Bhai Patel International Airport";
			internationalAirports[4]="Amadabad International Airport";
			
			getinternationalAirports();
			
	}
	
	    public static void getdomesticAirports(){
	
		
		
			for(int i=0;i<domesticAirports.length;i++){
			
			System.out.println(domesticAirports[i]+ " ");
			}
		}
			public static void getinternationalAirports(){
			System.out.print(internationalAirports.length);
		
		
			for(int i=0;i<internationalAirports.length;i++){
			
			System.out.println(internationalAirports[i]+ " ");
			}
		}
			
	}	
