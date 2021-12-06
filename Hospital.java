package com.xworkz.collection.Interface;

public class Hospital implements Cloneable{

	
	private String name;
	private int noOfDoctors;
	private String location;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the noOfDoctors
	 */
	public int getNoOfDoctors() {
		return noOfDoctors;
	}
	/**
	 * @param noOfDoctors the noOfDoctors to set
	 */
	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", noOfDoctors=" + noOfDoctors + ", location=" + location + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
