package com.xworkz.daocollection;

public class SvaagatIplTeam {

	public static void main(String[] args) {
		
		IplTeamDAO rcb = new IplTeamDAO();
		rcb.save("Royal Challengers Bangalore"); 
		rcb.save("Delhi Capitals");
		rcb.save("Punjab Kings");
		
		
		boolean find =rcb.find("Royal Challengers Bangalore");
		System.out.println(find);
		
		
		boolean find1 = rcb.find1("Royal challengers Bangalore");
		System.out.println(find1);
		
		boolean find2 = rcb.find2("Royalchallengersbangalore");
		System.out.println(find2);
		
	}
}
