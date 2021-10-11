class Table{
	
	public static Table table = null;
	
	public static Table getTable(){
		
		return table;
	}
	
	static{
		
		table = new Table();
		
	}
}

