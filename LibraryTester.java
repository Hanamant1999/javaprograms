import java.util.*;
class LibraryTester{
	
	public static void main(String a[])
	{
		System.out.println("Enter the Size ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Library library = new Library(size);
		
	for(int i=0; i<size; i++){
		
		BookDTO dto = new BookDTO();
		System.out.println("Enter the Book Detals ");
		System.out.println("Enter the Book Id");
		int bookId = sc.nextInt();
		dto.setBookId(bookId);
		
		System.out.println("Enter the Book name ");
		String bookName = sc.next();
		dto.setBookName(bookName);
		
		System.out.println("enter the Book author name");
		String author = sc.next();
		dto.setAuthorName(author);
		
		System.out.println("Enter the  Book Publisher Name");
		String publisher = sc.next();
		dto.setPublisher(publisher);
		
		System.out.println("Enter the the No of Pages ");
		int noOfPages = sc.nextInt();
		dto.setNoOfPages(noOfPages);
		
		System.out.println("enter the Priece");
		int priece = sc.nextInt();
		dto.setPriece(priece);
		
		System.out.println("ENter the edition ");
		int edition = sc.nextInt();
		dto.setEdtion(edition);

        boolean isAdded = library.createBook(dto);
		System.out.println(isAdded);		
	}
	    
		System.out.println("Enter the book id for getting the book ");
		int id = sc.nextInt();
		System.out.println(library.getBookByBookId(id));
		
		System.out.println("Enter the book name for getting the book ");
		String name = sc.next();
		System.out.println(library.getBookByBookName(name));
		
		System.out.println("Enter the author for getting the Book Name ");
		String author = sc.next();
		System.out.println(library.getBookNameByAuthor(author));
		
		System.out.println("Enter the book name for getting the publiser name ");
		String bookName = sc.next();
		System.out.println(library.getPublisherNameByBookName(bookName));
		
		System.out.println("Enter the priece for getting the Author name ");
		int priece = sc.nextInt();
		System.out.println(library.getAuthorNameByPriece(priece));
		
		System.out.println("Enter the publiser name  for getting the edition ");
		String publiser = sc.next();
		System.out.println(library.getEditionByPubliser(publiser));		
		
		System.out.println("Enter book id  for updating the author ");
		System.out.println("Enter the book id");
		int id2 =sc.nextInt();
		System.out.println("Enter the author name"); 
		String author2=sc.next();
		
		library.updateAuthorNameUsingBookId(id2 ,author2);
		
		library.getAllbooks();		
	}
}