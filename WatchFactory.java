class WatchFactory{
	
	static String watchs[]=new String[8];
	static int []pricesInDolars=new int[8];

	public static void main(String a[]){
		
		watchs[0]="Jaeger-LeCoultre";
		watchs[1]="Jaeger-LeCoultre";
		watchs[2]="Audemars Piguet";
		watchs[3]="Piaget";
		watchs[4]="Cartier";
		watchs[5]="Harry Winston";
		watchs[6]="Benson";
		watchs[7]="Benson";
		
		getwatches();
		
		
		
		pricesInDolars[0]=910;
		pricesInDolars[1]=350;
		pricesInDolars[2]=2500;
		pricesInDolars[3]=4523;
		pricesInDolars[4]=2542;
		pricesInDolars[5]=1235;
		pricesInDolars[6]=8523;
		pricesInDolars[7]=1456;
		
		getpricesInDolars();
		
	}
		public static void getwatches(){
			
		
	    for(int i=0;i<watchs.length;i++){
			
		System.out.println(watchs[i]);
		}
		}
		
		public static void getpricesInDolars(){
			
			
			
		for(int i=0;i<pricesInDolars.length;i++){
			
	    System.out.println(pricesInDolars[i]);
		}
		}
		
		
		
		}
