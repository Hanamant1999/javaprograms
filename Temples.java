class Temples{
	
	public static void main(String a[]){
	
		String[] temples=new String[5];
			temples[0]="Shaneshwara Temple Navarang";
			temples[1]="Sri Manjunatha Temple";
			temples[2]="Sree Kailasa Vaikunta Mahakshetra";
			temples[3]="Manjunatha Swamy Temple Trust";
			temples[4]="Lord Shiva Temple";
			
        float[] ratings=new float[5];
		        
		  ratings[0]=4.7f;
		  ratings[1]=4.9f;
		  ratings[2]=5.0f;
		  ratings[3]=4.8f;
		  ratings[4]=4.7f;
		 
		for(int i=0;i<temples.length;i++){
			
		System.out.println(temples[i]);
		 }
		
		for(int i=0;i<ratings.length;i++){
			
		System.out.println(ratings[i]);
		}
			
		

		}
}