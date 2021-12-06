package com.xworkz.collection.Interface;

public class Pens implements Cloneable{

	private String name;
	private String colour;
	private int rate;
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
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
  public  Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
		
	}
	@Override
	public String toString() {
		return "Pens [name=" + name + ", colour=" + colour + ", rate=" + rate + "]";
	}
}
