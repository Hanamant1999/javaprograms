class BookDTO{

public BookDTO(){
	
	System.out.println("inside default constructor");
}
	private int bookId;
	private String bookName;
	private String authorName;
	private String publisher;
	private int priece;
	private int noOfPages;
	private int edition;
	
	public void setBookId(int bookId){
		
		this.bookId=bookId;
	}
	
	public int getBookId(){
		
		return bookId;
	}
	
	public void setBookName(String bookName){
		
		this.bookName=bookName;
	}
	
	public String getBookName(){
		
		return bookName;
	}
	
	public void setAuthorName(String authorName){
		
		this.authorName=authorName;
	}
	
	public String getAuthorName(){
		
		return authorName;
	}
	
	public void setPublisher(String publisher){
		
		this.publisher=publisher;
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public void setNoOfPages(int noOfPages){
		
		this.noOfPages=noOfPages;
	}
	
	public int getNoOfPages(){
		
		return noOfPages;
	}
	
	public void setPriece(int priece){
		
		this.priece=priece;
	}
    
	public int getPriece(){
		
		return priece;
	}
	
	public void setEdtion(int edition){
		
		this.edition=edition;
	}
	
	public int getEdition(){
		
		return edition;
	}
	
		@Override
	public String toString()
	{
		return "BookDTO-{BookId = "+this.bookId+", BookNameName = "+this.bookName+", Author Name = "+this.authorName+", Publisher Name= "+this.publisher+", Book Priece = "+this.priece+", No of Pages= "+this.noOfPages+", Edition  = "+this.edition+"}";
	}
}