class Speaker{
	
	static String name="Boat";
	static int minVolume=0;
	static int maxVolume=15;
	static boolean isConnected = false;
	static int currentVolume;
	
	public static boolean onOrOff(){
		System.out.println("inside onoroff method ");
		if(isConnected == false){
			isConnected=true;
		System.out.println("The system is turned on ");
		
			
			return isConnected;
		}
		else{
		    if(isConnected == true){
			isConnected=false;
			}
			
			System.out.println("The system is turned off ");
			return isConnected;
		}
	}
	
	public static void increaseVolume(){
		System.out.println("inside increaseVolume() method");
		
		if(isConnected){
			if(currentVolume < maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The currentVolume is :" +currentVolume );
			}
			
			else{
				
				System.out.println("max volume is reached ");
			}
		}
			else{
				
				System.out.println("The sysytem is turned off go and turned on the speaker ");
			}			
				
			
		
		System.out.println("end of increaseVolume() method");		
	}
	
		public static void decreseVolume(){
		System.out.println("inside decrrese Volume() method");
		
		if(isConnected){
			if(currentVolume > minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The currentVolume is :" +currentVolume );
			}
			else{
				
				System.out.println("min volume is reached ");
			}
		}
			else{
				
				System.out.println("The sysytem is turned off go and turned on the speaker ");
			}			
				
			
		
		System.out.println("end of decreseVolume() method");		
	}
}