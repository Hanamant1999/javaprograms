class Gascylinder{
	
	public String brand;
	public String color;
	public double weight;
	
	public Gascylinder(String brand,String color,double weight){
		
		this.brand=brand;
		this.color=color;
		this.weight=weight;
		
		System.out.println(brand + " " +color + " " + weight);
		
	}
	
	public static void main(String a[]){
		
		System.out.println("----------------------------------------------------------------------");
		
		Gascylinder cylinder = new Gascylinder("HP","Red",20.00);
		
		System.out.println("----------------------------------------------------------------------");
			
		Gascylinder cylinder1 = new Gascylinder("Indian","Red",22.00);	
		
		System.out.println("----------------------------------------------------------------------");
			
     	Gascylinder cylinder2 = new Gascylinder("Bharat","Blue",22.00);
		
		System.out.println("----------------------------------------------------------------------");
		
}

}
