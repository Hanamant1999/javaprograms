package com.xworkz.collection.Interface;

public class SvaagatLaptop {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Laptop laptop = new Laptop();
		laptop.setName("HP");
		laptop.setPrieze(50000);
		laptop.setRam("4 GB Ram");
		laptop.setRom("1 TB HDD");
		
		System.out.println(laptop.getName());
		Object obj = laptop.clone();
		Laptop laptop1 = (Laptop) obj;
		System.out.println(laptop1.toString());
		
		
	}
}
