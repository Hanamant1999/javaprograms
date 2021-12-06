package com.xworkz.collection.Interface;

public class Laptop implements Cloneable{

	private String name;
	private String ram;
	private String rom;
	private int prieze;
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
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}
	/**
	 * @return the rom
	 */
	public String getRom() {
		return rom;
	}
	/**
	 * @param rom the rom to set
	 */
	public void setRom(String rom) {
		this.rom = rom;
	}
	/**
	 * @return the prieze
	 */
	public int getPrieze() {
		return prieze;
	}
	/**
	 * @param prieze the prieze to set
	 */
	public void setPrieze(int prieze) {
		this.prieze = prieze;
	}
	
	@Override
	public  Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ram=" + ram + ", rom=" + rom + ", prieze=" + prieze + "]";
	}
	
	
}
