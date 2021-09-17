class SpeakerUtil{
	
	public static void main(String a[]){
		
	boolean isConnected = Speaker.onOrOff();
	
	System.out.println("the speaker is connected "+ isConnected);
	
	
		
	Speaker.increaseVolume();
	Speaker.increaseVolume();


	 boolean isConnect = Speaker.onOrOff();
	
	System.out.println("the speaker is connected "+ isConnect);
	
	Speaker.decreseVolume();	
	
	Speaker.onOrOff();
	Speaker.decreseVolume();
	Speaker.decreseVolume();
	Speaker.decreseVolume();
	


	

	
	
}
}