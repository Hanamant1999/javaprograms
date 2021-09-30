class ProjectDTO{

	private String projectName;
	private String projectGuideName;
	private boolean SelectedForKscst;
	
	public void setprojectName(String projectName){
		
		this.projectName=projectName;
		
	}
	public void setprojectGuideName(String projectGuideName){
		this.projectGuideName=projectGuideName;
	}
	public void setSelectedForKscst(boolean SelectedForKscst){
		
		this.SelectedForKscst=SelectedForKscst;
	}
	public String getprojectName(){
		return projectName;
	}
	public String getprojectGuideName(){
		return projectGuideName;
	}
	public boolean getSelectedForKscst(){
		return SelectedForKscst;
	}
	
}