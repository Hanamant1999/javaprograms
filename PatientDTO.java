class PatientDTO{
	
	private long patientId;
	private String name;
	private int age;
	private String gender;
	private String address;
	private String bloodGroup;
	private long contactNumber;
	
	
	public long getPatientId(){
	return patientId;
	}
	
	public void setPatientId(long patientId){
		this.patientId=patientId;
		
	}
	
		public void setname(String name){
		this.name=name;
		
	}
		public void setage(int age){
		this.age=age;
		
	}
		public void setGender(String gender){
		this.gender=gender;
		
	}
			public void setAddress(String address){
		this.address=address;
			}
			public void setContact(long contactNumber){
		this.contactNumber=contactNumber;
			}			
			public void setbloodGroup(String bloodGroup)
			{
				this.bloodGroup=bloodGroup;
			}

		
	public String getName(){
		return name;
		
	}
	
	public int getAge(){
		return age;
		
	}
	
	public String getGender(){
		
		return gender;
		
	}
	
	public String getAddress(){
		
		return address;
		
	}
	
	public String getBlood(){
		
		return bloodGroup;
		
	}
	
	public long getContactNumber(){
		
		return contactNumber;
	}
}