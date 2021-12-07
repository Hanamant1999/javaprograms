package com.xworkz.collection.DAO;

public class SvaagatGym {

	public static void main(String[] args) {
		
		GymDAO gym = new GymDAO();
		gym.save("Quadz Fitness");
		gym.save("FitnessIn Gym");
		gym.save("Moveza Fitness - Rajajinagar");
		
	
		boolean find = gym.find("Quadz Fitness");
		System.out.println(find);
		
		boolean find1 =gym.findByCaseInsensitive("quadz fitness");
		System.out.println(find1);
		
		boolean find2 = gym.findByCaseInSensitiveAndTrimed("quadzfitness");
		System.out.println(find2);
	}
}
