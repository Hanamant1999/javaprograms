class Weather{
	
	public String cityName;
	public String temperature;
	public String humidity;
	
	public Weather(String town,String temp,String humi){
		
	System.out.println("Welcome to the weather reporting ");
	cityName=town;
	
	temperature=temp;
	humidity=humi;
	System.out.println(cityName + " \n" + temperature + "\n " + humidity);
	}
	

}
