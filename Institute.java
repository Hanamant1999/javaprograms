package com.xworkz.collection.Interface;

public class Institute implements Cloneable{

	private String name;
	private String founderName;
	private String locaton;
	private String hrName;
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
	 * @return the founderName
	 */
	public String getFounderName() {
		return founderName;
	}
	/**
	 * @param founderName the founderName to set
	 */
	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}
	/**
	 * @return the locaton
	 */
	public String getLocaton() {
		return locaton;
	}
	/**
	 * @param locaton the locaton to set
	 */
	public void setLocaton(String locaton) {
		this.locaton = locaton;
	}
	/**
	 * @return the hrName
	 */
	public String getHrName() {
		return hrName;
	}
	/**
	 * @param hrName the hrName to set
	 */
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	
	@Override
  public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Institute [name=" + name + ", founderName=" + founderName + ", locaton=" + locaton + ", hrName="
				+ hrName + "]";
	}
	
	
}
