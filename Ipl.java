class Ipl{
 
		static String iplTeams[]=new String[8];
		static String teamCaptain[]=new String[8];
		public static void main(String a[]){
		
			
			  iplTeams[0]="Royal Challengers Bangalore";
			  iplTeams[1]="sunrises hyderabad";
			  iplTeams[2]="Rajasthan Royals";
			  iplTeams[3]="Mumbai Indians";
			  iplTeams[4]="Kolkata Knight Riders";
			  iplTeams[5]="Punjab Kings";
			  iplTeams[6]="Delhi Capitals";
			  iplTeams[7]="Chennai Super Kings";
			
			getiplTeams();
			
			
			  teamCaptain[0]="Virat Kohli";
			  teamCaptain[1]="David Warner";
			  teamCaptain[2]="Sanju Samson";
			  teamCaptain[3]="Rohit Sharma";
			  teamCaptain[4]="Eoin Morgan";
			  teamCaptain[5]="KL Rahul";
			  teamCaptain[6]="Shreyas Iyer";
			  teamCaptain[7]="M S Dhoni";
			  getteamCaptain();
			  
			  
		}
			public static void getiplTeams(){
				
			  
		    for(int i=0;i<iplTeams.length;i++){
			
			System.out.println(iplTeams[i]);
		    }
			}
			
			public static void getteamCaptain(){
				
			
		    for(int i=0;i<teamCaptain.length;i++){
			
			System.out.println(teamCaptain[i]);
		    }
			}
			
			
		
}		
			
