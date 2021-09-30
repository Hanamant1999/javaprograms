class PatientUtil{
	
	public static void main(String a[]){
		
		
		PatientDTO dto = new PatientDTO();
			
			dto.setPatientId(2532654822545L);
			dto.setname(" Ramadev baba");
			dto.setage(85);
			dto.setGender("male");
			dto.setAddress("Himalaya");
			dto.setContact(9110292315L);
			dto.setbloodGroup("b+");
			
			System.out.println(dto.getName() + "\n " +dto.getAge()+ "\n " +dto.getGender() + " \n" +dto.getAddress()+ " \n" + dto.getBlood() + "\n " +dto.getContactNumber());
		
	}
}

