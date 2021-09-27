class ChocolatesTester{
	
	public static void main(String a[]){
		
		Chocolates chocolate1 = new Chocolates();
		
		chocolate1.name = "Silk-Bubbly";
		chocolate1.place = "Banglore";
		chocolate1.basicPriece =384;
		chocolate1.company ="Dairy-Milk";
		
		
		System.out.println("Chocolate: " + chocolate1.name);
		System.out.println("Available in :" +chocolate1.place);
		System.out.println("priece:" +chocolate1.basicPriece);
		System.out.println("company:" +chocolate1.company);
		 
		System.out.println("----------------------------------");
		 
		Chocolates chocolate2 = new Chocolates();
		
		chocolate2.name = "Amul Chocolate";
		chocolate2.place = "Banglore";
		chocolate2.basicPriece =800;
		chocolate2.company ="Amul";
		
		System.out.println("Chocolate: " + chocolate2.name);
		System.out.println("Available in :" +chocolate2.place);
		System.out.println("priece:" +chocolate2.basicPriece);
		System.out.println("company:" +chocolate2.company);
		
		System.out.println("----------------------------------");
		
		Chocolates chocolate3 = new Chocolates();
		
		chocolate3.name = "KitKat Chocolate";
		chocolate3.place = "Banglore";
		chocolate3.basicPriece =20;
		chocolate3.company ="Nestle";
		
		System.out.println("Chocolate: " + chocolate3.name);
		System.out.println("Available in :" +chocolate3.place);
		System.out.println("priece:" +chocolate3.basicPriece);
		System.out.println("company:" +chocolate3.company);
		
		System.out.println("----------------------------------");
	}
}
		