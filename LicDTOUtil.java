public class LicDTOUtil{
	
	public static void main(String a[]){
		
	 LicDTO lic =new LicDTO();

	 lic.setPolicyHolderName("Sudeep");
	 lic.setPolicyId("199Ec565");
	 lic.setMobileNum(9115526874L);
	 
	 System.out.println(lic.getPolicyHolderName() + " " + lic.getPolicyId()+ " " + lic. getMobileNum());
	 
	}
}
        