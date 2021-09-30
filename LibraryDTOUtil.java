class LibraryDTOUtil{
	
	public static void main(String a[]){
		
		LibraryDTO lib = new LibraryDTO();
		lib.setLibraryNmae("Ranna Granthalaya");
		lib.setLibrarianNmae("Ravi");
		lib.setNoOfBoks(452635236);
		
		System.out.println("Library name is:"  +lib.getLibraryNmae() +"\n" + "Librarian Name is:" + lib.getLibrarian()+"\n" + "No of Books In Library is:" + lib.getNoOfBooks());
		
    }
}