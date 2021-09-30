public class LicDTO{
	
	private String policyHolderName;
	private String policyId;
	private long mobileNum;
	
	
	public void setPolicyHolderName(String policyHolderName){
		
		this.policyHolderName=policyHolderName;
	}
	public void setPolicyId(String policyId){
		
		this.policyId=policyId;
	}
	public void setMobileNum(long mobileNum){
		
		this.mobileNum=mobileNum;
	}
	
	public String getPolicyHolderName(){
		
		return policyHolderName;
	}
	public String getPolicyId(){
		
		return policyId;
	}
	
	public long getMobileNum(){
		
		return mobileNum;
	}
	
}