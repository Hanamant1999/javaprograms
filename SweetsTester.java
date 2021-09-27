class SweetsTester{
	
	public static void main(String a[]){
		
		Sweets sweet1 = new Sweets();
		
		sweet1.name = "Mysore-pak";
		sweet1.place = "Mysore";
		sweet1.basicPriece = "82.50  rupees for 100 g";
		sweet1.shape = "Rectangle" ;
		
		System.out.println(sweet1.name);
		System.out.println(sweet1.place);
		System.out.println(sweet1.basicPriece);
		System.out.println(sweet1.shape);
		
		Sweets sweet2 = new Sweets();
		
		sweet2.name = "Dharawad-peda";
		sweet2.place = "Dharawad";
		sweet2.basicPriece = "50 rupees for 100 g";
		sweet2.shape = "Round" ;
		
		System.out.println(sweet2.name);
		System.out.println(sweet2.place);
		System.out.println(sweet2.basicPriece);
		System.out.println(sweet2.shape);		
		
		Sweets sweet3 = new Sweets();
		
		sweet3.name = "Kunda ";
		sweet3.place = "Belagavi";
		sweet3.basicPriece = "45 rupees for 100 g";

		
		System.out.println(sweet3.name);
		System.out.println(sweet3.place);
		System.out.println(sweet3.basicPriece);
	
	}
}