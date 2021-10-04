class LaptopTester {
	
	public static void main(String a[]){
		
		Dell dell =new Dell();
		
		dell.priece= 48000;
		dell.modelNumber="525dfdgg41";
		dell.storage="1TBHDD";
		dell.processor="Intel";
		
		dell.display();
		
		Hp hp =new Hp();
		
		hp.priece= 48000;
		hp.modelNumber="525dfdgg41";
		hp.storage="1TBHDD";
		hp.processor="RYZEN";
		
		hp.display();
		
		String store = dell.store();
		System.out.println(store);
		

		
		
	}
}
