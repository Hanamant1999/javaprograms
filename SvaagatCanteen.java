package com.xworkz.collection.Interface;

class SvaagatCanteen {

public static void main(String[] args) throws CloneNotSupportedException {
	
	Canteen canteen =new Canteen();
	canteen.setCanteenName("Manjunath Candimates");
	canteen.setLocation("Rajajinagar");
	canteen.setType("Pure Veg");
	
	Object obj = canteen.clone();
	
	Canteen canteen1 = (Canteen)obj;
	System.out.println(canteen1.toString());
}

}


