package com.xworkz.collection.Interface;

public class Canteen implements Cloneable{

	private String canteenName;
	private String location;
	private String type;
	/**
	 * @return the canteenName
	 */
	public String getCanteenName() {
		return canteenName;
	}
	/**
	 * @param canteenName the canteenName to set
	 */
	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
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
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public  Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Canteen [canteenName=" + canteenName + ", location=" + location + ", type=" + type + "]";
	}
	
	
}
