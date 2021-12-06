package com.xworkz.collection.Interface;

public class Mobile implements Cloneable {

	private String name;
	private int prieze;
	private int ram;
	private int rom;
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
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	/**
	 * @return the rom
	 */
	public int getRom() {
		return rom;
	}
	/**
	 * @param rom the rom to set
	 */
	public void setRom(int rom) {
		this.rom = rom;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", prieze=" + prieze + ", ram=" + ram + ", rom=" + rom + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
