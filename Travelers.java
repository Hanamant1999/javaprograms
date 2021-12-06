package com.xworkz.collection.Interface;

public class Travelers implements Cloneable {

	private String travelersName;
	private int noOfBuses;
	private int noOfBranches;
	/**
	 * @return the travelersName
	 */
	public String getTravelersName() {
		return travelersName;
	}
	/**
	 * @param travelersName the travelersName to set
	 */
	public void setTravelersName(String travelersName) {
		this.travelersName = travelersName;
	}
	/**
	 * @return the noOfBuses
	 */
	public int getNoOfBuses() {
		return noOfBuses;
	}
	/**
	 * @param noOfBuses the noOfBuses to set
	 */
	public void setNoOfBuses(int noOfBuses) {
		this.noOfBuses = noOfBuses;
	}
	/**
	 * @return the noOfBranches
	 */
	public int getNoOfBranches() {
		return noOfBranches;
	}
	/**
	 * @param noOfBranches the noOfBranches to set
	 */
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	
	@Override
	public  Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Travelers [travelersName=" + travelersName + ", noOfBuses=" + noOfBuses + ", noOfBranches="
				+ noOfBranches + "]";
	}
	

}
