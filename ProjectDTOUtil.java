class ProjectDTOUtil{
	
	public static void main(String a[]){
		
		ProjectDTO pro = new  ProjectDTO();
		pro.setprojectName("REAL TIME AUTOMATIC POLATARY FARM MANAGEMENT");
		pro.setprojectGuideName("Prof. Jyoti M Katagi");
		pro.setSelectedForKscst(true);
		
		System.out.println(pro.getprojectName() + "\n " + pro.getprojectGuideName() + " \n" + pro.getSelectedForKscst());
		
	}
}