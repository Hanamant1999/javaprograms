class Hospital
{
	public PatientDTO[] patients;
	private int index;
	
	public Hospital(int size)
	{
		patients =new PatientDTO[size];
	}
	
	public boolean createPatient(PatientDTO patients)
	{
		boolean patientAdded = false;
		System.out.println("Inside create patient method ");
			if(patients != null)
			{
				this.patients[index++] = patients;
				patientAdded = true;
			}
			else
			{
				System.out.println("No Patient added");
				return patientAdded = false;
			}
		return patientAdded;
	}
	
	public void getAllPatients()
	{
		for(int i=0; i<patients.length; i++)
		{
			System.out.println(patients[i]);
		}
	}
	
	public PatientDTO getPatientByName(String patientName)
	{
		boolean f=false;
		PatientDTO patientDTO = null;
		System.out.println("Inside Get patient by name method");
		if(patientName != null)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getPatientName().equals(patientName))
				{
					System.out.println("Patient found by Name : "+patientName);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
		public PatientDTO getPatientByAddress(String address)
	{
		boolean f=false;
		PatientDTO patientDTO = null;
		System.out.println("Inside Get patient by address method");
		if(address != null)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getPatientAddress().equals(address))
				{
					System.out.println("Patient found by Name : "+address);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	public PatientDTO getPatientById(int patientId)
	{
		boolean f=false;
		PatientDTO patientDTO = null;
		System.out.println("Inside Get patient by id method");
		if(patientId != 0)
		{
			for(int i=0; i<patients.length; i++)
			{
				if(patients[i].getPatientId()==(patientId))
				{
					System.out.println("Patient found by ID : "+patientId);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
	public PatientDTO getPatientByAge(int age)
	{
		boolean f=false;
		PatientDTO patientDTO=null;
		System.out.println("Inside get patient by age method");
		if(age != 0)
		{
			for(int i =0;i<patients.length;i++)
			{
				if(patients[i].getPatientAge()==(age))
				{
					System.out.println("Patient found by age : "+age);
					patientDTO = patients[i];
					f=true;
					break;
				}
				else
				{
					f=false;
					
				}
			}
		}
		if(f==false)
		{
			System.out.println("Patient not found");
		}
		return patientDTO;
	}
	
	public void upadatePatientsContactNo(int patientId, long contactNo){
		
		boolean f=false;
		PatientDTO patientDTO=null;
		System.out.println("inside updare name method");
		int i=0;
		
		if(patients[i] !=null && contactNo > 0)
		{
			for( i=0; i<patients.length; i++){
				if(patients[i].getPatientId()==(patientId))
				{
					System.out.println("patient contact number updated to : " + contactNo);
					patients[i].setPatientContactNumber(contactNo);
					
					f=true;
					
				}
				else
				{
					f=false;
					
				}
			}
		}
		if(f==false)
		{
			System.out.println("Patent contact number is not upadated ");
		}
	}
	
	
	public void upadatePatientsAddressUsingName(String patientName, String address){
		
		boolean f=false;
		PatientDTO patientDTO=null;
		System.out.println("inside update address by usng the patient name  method");
		int i=0;
		
		if(patients[i] !=null && address !=null)
		{
			for( i=0; i<patients.length; i++){
				if(patients[i].getPatientName().equals(patientName))
				{
					System.out.println("patient address  updated to  : " + address);
					patients[i].setPatientAddress(address);
					
					f=true;
					
				}
				else
				{
					f=false;
					
				}
			}
		}
		if(f==false)
		{
			System.out.println("Patent contact nu is not upadated ");
		}
	}
	
	public void updatePatientAddressUsingId(int patientId, String address){
		
		boolean f = false;
		PatientDTO patientDTO = null;
		
		System.out.println("inside the updatePatientAddressUsingId method");
		
		int i =0;
		
		if(patients[i]!=null && address !=null)
		{
			for(i=0; i<patients.length; i++)
			{
				if(patients[i].getPatientId()==patientId)
				{
					System.out.println("updating patient address using the patient id and the new address is  :" +address);
					
					patients[i].setPatientAddress(address);
					
					f=true;
				}
			}
		}
		
			if(f==false)
			{
				System.out.println("Patient address is not updating");
			}
		
	}
	
}
		