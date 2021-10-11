class Gun{
	
	public Gun(){
		System.out.println("construcor s called");
		System.out.println(this.getClass().getSimpleName()+" Object is created ");
		
	}
	
	static{
		System.out.println("static block s executed");
	}
	
	{
		System.out.println("init block s executed");
	}
}
