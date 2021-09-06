class Country{
		static String[] countryName=new String[5];
		static int[] noOfStates=new int[5];
		public static void main(String a[]){
		
			    countryName[0]="india";
				countryName[0]="pakistan";
				countryName[0]="usa";
				countryName[0]="southAfrica";
				countryName[0]="Nepal";
				
				getcountryName();
			
			
			int[] noOfStates=new int[5];
			    noOfStates[0]=29;
				noOfStates[1]=32;
				noOfStates[2]=5;
				noOfStates[3]=22;
				noOfStates[4]=25;
				
				getnoOfStates();
		}

			public static void getcountryName(){
				
					 
				for(int i=0;i < countryName.length;i++){
			
				System.out.println(countryName[i]);
				}
			}
			
			public static void getnoOfStates(){
				
			
				for(int i=0;i<noOfStates.length;i++){
			
				System.out.println(noOfStates[i]);
				}
			}
	}



