class MncCompaniesTester{

    public static void main(String a[]){
	
	System.out.println("-------------------------------------------------------");
	
	RobertBosch rob =new RobertBosch();
	
	rob.companyName ="Robert Bosch Engineering & Business Solutions";
	rob.location ="No. 3050, RMB Complex, Hosur Road, Adugodi, Bangalore - 560030";
	rob.ratings =4.5;
	rob.yearOfEstablished =2007;
	
	rob.service("RobertBosch");
	rob.display();
	
	System.out.println("------------------------------------------------------");
	
	ConvergysIndia con =new ConvergysIndia();
	
	con.companyName ="Convergys INDIA Services Pvt Ltds";
	con.location ="No.55, Divyashree Towers, New Gurappana Palya, Bannerghatta Road, Bangalore - 560076, Opposite Jayadeva Hospital";
	con.ratings =3.9;
	con.yearOfEstablished =1992;
	
	con.service("ConvergysIndia");
	con.display();
	
	System.out.println("-------------------------------------------------------");
	
	Cgi cgi=new Cgi();
	
	cgi.companyName ="CGI Information Systems & Management Consultants ";
	cgi.location ="No.95/1 & 95/2, Tower 2, 3rd Cross, Electronic City Phase 1, Bangalore - 560100";
	cgi.ratings =4.2;
	cgi.yearOfEstablished =1997;
	
	cgi.service("CGI Information Systems & Management Consultants ");
	cgi.display();
	
	System.out.println("-------------------------------------------------------");
	
	Mcafee mca =new Mcafee();
	
	mca.companyName ="Mcafee Software India Pvt Ltd";
	mca.location ="Embassy Golf Link Business Park, 2nd Floor, Pine Valley, Domlur, Bangalore - 560071, Off Inner Ring Road";
	mca.ratings =4.4;
	mca.yearOfEstablished =2004;
	
	mca.service("Mcafee Software India Pvt Ltd ");
	mca.display();
	
	System.out.println("-------------------------------------------------------");
	
	Intel intel =new Intel();
	
	intel.companyName ="INTEL Technology INDIA Pvt Ltd ";
	intel.location ="No.136, Kodihalli, Old Airport Road, Bangalore - 560017, Opposite Leela Palace";
	intel.ratings =4.5;
	intel.yearOfEstablished =1997;
	
	intel.service("INTEL Technology INDIA Pvt Ltd  ");
	intel.display();
	
	System.out.println("-------------------------------------------------------");
	
	Tesco tesco =new Tesco();
	
	tesco.companyName ="Tesco Hindustan Service Centre";
	tesco.location ="No.81/82, Research Centre, Epip Area, Whitefield, Bangalore - 560066, Next Vydehi Hospital ";
	tesco.ratings =4.0;
	tesco.yearOfEstablished =2004;
	
	tesco.service("Tesco Hindustan Service Centre ");
	tesco.display();
	
	System.out.println("-------------------------------------------------------");
	}
}