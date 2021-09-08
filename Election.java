class Election{
	
	public static String electionName="	Lok Sabha Election";
	
	public static int age = 25;
	
	public static void eligible(String[] voterId){
	
		System.out.println("eligible method started here ");
		
		if(age>18){
		
		System.out.println("you are eligible for voting please show your voter ID ");
		
		if(null != voterId){
		
			getVoterIdDetails(voterId);
			
			System.out.println("allow for voting");
			
			}
			else{
			
				System.out.println("Please Find your Voter ID for voting");
				}
			}
			
			System.out.println("eligible method ended here");
			
	}

	
     public static void getVoterIdDetails(String[] voterId){
         for(int i=0 ; i  < voterId.length ; i++){
			System.out.println(voterId[i]);
        }

     }

}