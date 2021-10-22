class PatientDTO{

	public PatientDTO(){
		System.out.println("default method created ");
		
	}
		
	private int patientId;
	private String patientName;
	private long contactNo;
	private String address;
	private String bloodGroup;
	private int age;
	private String gender; 
	
	public void setPatientId(int patientId){
		
		this.patientId=patientId;
	}
	
	public int getPatientId(){
		
		return patientId;
	}
	
		public void setPatientName(String patientName){
		
		this.patientName=patientName;
	}
	
	public String getPatientName(){
		
		return patientName;
	}
	
		public void setPatientContactNumber(long contactNo){
		
		this.contactNo=contactNo;
	}
	
	public long getPatientContactNumber(){
		
		return contactNo;
	}

		public void setPatientAddress(String address){
		
		this.address=address;
	}
	
	public String getPatientAddress(){
		
		return address;
	}
	
	
	public void setPatientBloodGroup(String bloodGroup){
		
		this.bloodGroup=bloodGroup;
	}
	
	public String getPatientBloodGroup(){
		
		return bloodGroup;
	}
	
	public void setPatientAge(int age){
		
		this.age=age;
	}
	
	public int getPatientAge(){
		
		return age;
	}
	
	public void setPatientGender(String gender){
		
		this.gender=gender;
	}
	
	public String getPatientGender(){
		
		return gender;
	}
	
	
	@Override
	public String toString()
	{
		return "patientDTO-{Patient Id = "+this.patientId+"Patient Name = "+this.patientName+",ContactNo = "+this.contactNo+",BloodGroup = "+this.bloodGroup+",Age = "+this.age+",Gender = "+this.gender+",Address = "+this.address+"}";
	}
	
}