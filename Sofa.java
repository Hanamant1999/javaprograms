class Sofa{
	
	public String brandName;
	public String type;
	public int weight;
	
	public Sofa(String brandName,String type,int weight){
		
		this.brandName=brandName;
		this.type=type;
		this.weight=weight;
		
		System.out.println(brandName + " " +type+ " " +weight);
		System.out.println("----------------------------------------------------------------------");
	}
	
	public static void main(String a[]){
		
	Sofa sofa = new Sofa("single sofa","plastic",1);	
	Sofa sofa1 = new Sofa("double sofa","wooden",10);
    Sofa sofa2= new Sofa("longsofa","wooden",20);
	
	}
}