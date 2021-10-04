class EngineerTester {
	
	public static void main(String a[]){
		
		System.out.println("-------------------------------------------------------");
		Ece ece =new Ece();
		
		ece.colleageName = "BGMIT Mudhol";
		ece.branchName = "Electronics and communication Engvineering";
		ece.hodName = "Prof.Sneha Kotin";
		ece.noOfStafMembers =15;
		ece.noOfEquipments =65;
		
		ece.display();
		ece.problemSolving("ECE Engineer");
		
		System.out.println("-------------------------------------------------------");
		
		Cse cse =new Cse();
		
		cse.colleageName = "BGMIT Mudhol";
		cse.branchName = "Computer and Science Engvineering";
		cse.hodName = "Prof.Basavaraj Kumbar";
		cse.noOfStafMembers =10;
		cse.noOfEquipments =25;
		
		cse.display();
		cse.problemSolving("CSE Engineer");
		
		System.out.println("-------------------------------------------------------");
		
		Mech mech =new Mech();
		
		mech.colleageName = "BGMIT Mudhol";
		mech.branchName = "Mechanical Engvineering";
		mech.hodName = "Prof.mallu Hunasikatti";
		mech.noOfStafMembers =15;
		mech.noOfEquipments =40;
		
		mech.display();
		mech.problemSolving("Mechanical Engineer");
		
		System.out.println("-------------------------------------------------------");
		
		
		Civil civil =new Civil();
		
		civil.colleageName = "BGMIT Mudhol";
		civil.branchName ="Civil Engvineering";
		civil.hodName = "Prof.Nagaraj Choudapur";
		civil.noOfStafMembers =12;
		civil.noOfEquipments =38;
		
		civil.display();
		civil.problemSolving("Civil Engineer");
		
		System.out.println("-------------------------------------------------------");
		
		Electrical eee =new Electrical ();
		
		eee.colleageName = "BGMIT Mudhol";
		eee.branchName ="Electrical Engvineering";
		eee.hodName = "Prof.Gururaj Kori";
		eee.noOfStafMembers =11;
		eee.noOfEquipments =40;
		
		eee.display();
		eee.problemSolving("Electrical Engineer");
		
		System.out.println("-------------------------------------------------------");
	}
}