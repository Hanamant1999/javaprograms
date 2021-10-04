class LaptopTester {
	
	public static void main(String a[]){
		
		Dell dell =new Dell();
		
		dell.priece(48000);
		dell.modelNumber("525dfdgg41");
		dell.storage("1TBHDD");
		dell.processor("Intel");
		
		String store =dell.display();
		
		System.out.println(store);
		
		dell.store();
		
		
	}
}
