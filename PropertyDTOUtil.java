class PropertyDTOUtil{
	
	public static void main(String a[]){
		
		PropertyDTO dto = new PropertyDTO();
		
		dto.setProprtyHolderName("AAdya");
        dto.setLocation("Vijayapur");
		dto.setPropertyNumber("445sd9ij8");

        System.out.println(dto.getProprtyHolderName() + " " + dto.getLocation()	+ " " + dto.getPropertyNumber());

	}
}