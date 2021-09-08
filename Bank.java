class Bank{
	
	public static String bankName="Canara Bank";
	
	public static String branchName="Ronihal";
	
	public static int age=20;
	
	public static void accountOpening(String[] adaraCard,String[] panCard){
	
	System.out.println("accountOpening started here ");
	
	if(age>18){
	
	System.out.println("your eligible for getting the canara bank account please provide your adaracard details and PAN Card details ");
	
	if(null != panCard ){
	
	getadaraCardDetails(adaraCard);
	getadpanCardDetails(panCard);
	
	System.out.println("Your canara bank account is created pleaser deposit some money  ");
	
    }
	else
	
	{
	 	System.out.println("your adaraCard and pan card  details are not found ");
		
	}
	}
	else{
		
			System.out.println(" your not not eligible for opening the canara bank account");
		}	
	
	}	
	
		
	
	
	
	
	public static void  getadaraCardDetails(String[] adaraCard){	
		
		for(int i=0 ; i  <  adaraCard.length ; i++){	
			System.out.println(adaraCard[i]);
			
		}
		}
		public static void  getadpanCardDetails(String[] panCard){	
		
		for(int i=0 ; i  <  panCard.length ; i++){	
			System.out.println(panCard[i]);
			
		}
		}
		
		
		
	}
	
	
	
