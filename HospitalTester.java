import java.util.*;

class HospitalTester{

	public static void main(String a[]){
		
	System.out.println("Enter the no of patient size");    
	// size providing at the runtime
	Scanner sc = new Scanner(System.in);	
    int size = sc.nextInt();
	Hospital hospital = new Hospital(size);
	
	
	
	for(int i=0; i<size; i++){
		
		PatientDTO dto = new PatientDTO();
		System.out.println("Enter the patient Detals ");
		System.out.println("Enter the Patient Id");
		int PatientId = sc.nextInt();
		dto.setPatientId(PatientId);
		
		System.out.println("Enter the Patient Name");
		String setPatientName =sc.next();
		dto.setPatientName(setPatientName);
		
		System.out.println("Enter the Patient Contact Number");
		long PatientContactNumber = sc.nextLong();
		dto.setPatientContactNumber(PatientContactNumber);
		
		System.out.println("Enter the Patient Address");
		
		String PatientAddress = sc.next();
		dto.setPatientAddress(PatientAddress);
		
		System.out.println("Enter the Patient Blood Goup");
		String PatientBloodGroup = sc.next();
		dto.setPatientBloodGroup(PatientBloodGroup);
		
		System.out.println("Enter the Patient Age");
		int PatientAge =sc.nextInt();
		dto.setPatientAge(PatientAge);
		
		System.out.println("Enter the Patient Gender");
		String PatientGender = sc.next();
		dto.setPatientGender(PatientGender);
	
		boolean isAdded = hospital.createPatient(dto);
		System.out.println(isAdded);
		}
		
		hospital.getAllPatients();	
		
		System.out.println("\n"+"Enter the patient name");
		String patientName = sc.next();
		System.out.println(hospital.getPatientByName(patientName));
		
		System.out.println("\n"+"Enter the patient ID");
		int patientId = sc.nextInt();
		System.out.println(hospital.getPatientById(patientId));
		
		System.out.println("\n"+"Enter patient Age");
		int age=sc.nextInt();
		System.out.println(hospital.getPatientByAge(age));
		
		
		System.out.println("Enter the patient id");
		int id1 =sc.nextInt();
		System.out.println("Enter the patient new contacat number");
		long con=sc.nextLong();
		
		hospital.upadatePatientsContactNo(id1,con);
		
		hospital.getAllPatients();
		
		System.out.println("Enter the patient Name"); 
		String name =sc.next();
		System.out.println("Enter the patient new Address"); 
		String address1=sc.next();
		
		hospital.upadatePatientsAddressUsingName(name ,address1);
		
		hospital.getAllPatients();
		
		System.out.println("Enter the patient id");
		int id2 =sc.nextInt();
		System.out.println("Enter the patient new Address"); 
		String address2=sc.next();
		
		hospital.updatePatientAddressUsingId(id2 ,address2);
		
		hospital.getAllPatients();		
	}
}