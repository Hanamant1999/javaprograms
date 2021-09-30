class LibraryDTO{
	
	private String libraryName;
	private String librarianName;
	private int noOfBooks;
	private String location;
	
	public void setLibraryNmae(String libraryName){
		
		this.libraryName = libraryName;
		
	}
	public void setLibrarianNmae(String librarianName){
		
		this.librarianName=librarianName;
	}
	
	public void setNoOfBoks(int noOfBooks){
		
		this.noOfBooks = noOfBooks;
	}
	
	public String getLibraryNmae(){
		
		return libraryName;
	}
	public String getLibrarian(){
		
		return librarianName;
	}
	public int getNoOfBooks(){
		
		return noOfBooks;
	}
}
