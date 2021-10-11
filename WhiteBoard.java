class WhiteBoard{
	
	public static WhiteBoard whiteBoard = null;
	
	public static WhiteBoard getWhiteBoard(){
		
		return whiteBoard;
		
		
	}
	
	static{
		
		whiteBoard = new WhiteBoard();
	}
}
