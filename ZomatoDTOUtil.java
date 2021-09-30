class ZomatoDTOUtil{
	
	public static void main(String a[]){
		
		ZomatoDTO dto = new ZomatoDTO();
		
		dto.setname("");
		dto.setlocation("Rajajinagar");
		dto.setid(25478);
		
	System.out.println(dto.getname()+ " " +dto.getlocation() +" "+dto.getid());
	
	}
}