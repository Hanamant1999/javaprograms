class  BankUtil{
	

		static String[] adaraCard = {"Modi","Gujarat","91xxxxxxxx"};
		static String[] panCard = {"Modi","PAN452155","Gujarat"};
		
		public static void main(String a[]){
			System.out.println("main method started");
			Bank.accountOpening(adaraCard,panCard);
			System.out.println("main method ended");
		}

}