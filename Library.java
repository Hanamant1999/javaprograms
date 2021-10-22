class Library{
	
	public BookDTO[] books;
	private int index;
	
	public Library(int size)
	{
		books =new BookDTO[size];
	}
	
	public boolean createBook(BookDTO books)
	{
		boolean booksAdded = false;
		System.out.println("Inside create books method ");
			if(books != null)
			{
				this.books[index++] = books;
				booksAdded = true;
			}
			else
			{
				System.out.println("No books added");
				return booksAdded = false;
			}
		return booksAdded;
	}
	
	public void getAllbooks()
	{
		for(int i=0; i<books.length; i++)
		{
			System.out.println(books[i]);
		}
	}
	
	public BookDTO getBookByBookId(int bookId)
	{
		boolean f=false;
		BookDTO bookDTO = null;
		System.out.println("Inside Get book by bookid method");
		if(bookId != 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getBookId()==(bookId))
				{
					System.out.println("book found by using id : "+bookId);
					bookDTO = books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("book not found");
		}
		return bookDTO;
	}
	
	public BookDTO getBookByBookName(String bookName)
		{
			boolean f=false;
			BookDTO bookDTO = null;
			System.out.println("Inside Get Books by name method");
			if(bookName != null)
			{
				for(int i=0; i<books.length; i++)
				{
					if(books[i].getBookName().equals(bookName))
					{
						System.out.println("Book  found by using the Book Name : "+bookName);
						bookDTO = books[i];
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}	
			}
			if(f==false)
			{
				System.out.println("book not found");
			}
			return bookDTO;
		}
		
			public BookDTO getBookByAuthorName(String authorName)
		{
			boolean f=false;
			BookDTO bookDTO = null;
			System.out.println("Inside Get Books by authorName method");
			if(authorName != null)
			{
				for(int i=0; i<books.length; i++)
				{
					if(books[i].getAuthorName().equals(authorName))
					{
						System.out.println("Book  found by using authorName: "+authorName);
						bookDTO = books[i];
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}	
			}
			if(f==false)
			{
				System.out.println("book not found");
			}
			return bookDTO;
		}
		
		public BookDTO getBookByPublisher(String publisher)
		{
			boolean f=false;
			BookDTO bookDTO = null;
			System.out.println("Inside Get Books by publisher method");
			if(publisher != null)
			{
				for(int i=0; i<books.length; i++)
				{
					if(books[i].getPublisher().equals(publisher))
					{
						System.out.println("Book  found by publisher: "+publisher);
						bookDTO = books[i];
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}	
			}
			if(f==false)
			{
				System.out.println("book not found");
			}
			return bookDTO;
		}

	public BookDTO getBookByPriece(int priece)
	{
		boolean f=false;
		BookDTO bookDTO = null;
		System.out.println("Inside Get book by priece method");
		if(priece != 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getPriece()==(priece))
				{
					System.out.println("book found by using Book priece : "+priece);
					bookDTO = books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("book not found");
		}
		return bookDTO;
	}
	
	public BookDTO getBookByNoOfPages(int noOfPages)
	{
		boolean f=false;
		BookDTO bookDTO = null;
		System.out.println("Inside Get book by noOfPages method");
		if(noOfPages != 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getNoOfPages()==(noOfPages))
				{
					System.out.println("book found by using  noOfPages : "+noOfPages);
					bookDTO = books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("book not found");
		}
		return bookDTO;
	}
	
	public BookDTO getBookByEdition(int edition)
	{
		boolean f=false;
		BookDTO bookDTO = null;
		System.out.println("Inside Get book by edition method");
		if(edition != 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getEdition()==(edition))
				{
					System.out.println("book found by using edition : "+edition);
					bookDTO = books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("book not found");
		}
		return bookDTO;
	}
	
	public BookDTO getBookById(int bookId)
	{
		boolean f=false;
		BookDTO bookDTO = null;
		System.out.println("Inside Get Book  by id method");
		if(bookId != 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getBookId()==(bookId))
				{
					System.out.println("Book found by using  ID : "+bookId);
					bookDTO = books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Book not found");
		}
		return bookDTO;
	}
	
	
	public BookDTO getBookByName(String bookName)
	{
		boolean f=false;
		BookDTO bookDTO = null;
		System.out.println("Inside Get Book  by bookName method");
		if(bookName != null)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getBookName().equals(bookName))
				{
					System.out.println("Book found by bookName : "+bookName);
					bookDTO = books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Book not found");
		}
		return bookDTO;
	}
	public String getBookNameByAuthor(String authorName)
	{
		boolean f=false;
		String bookName1 = null;
		System.out.println("Inside Get Bookname  by Author method");
		if(authorName != null)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getAuthorName().equals(authorName))
				{
					System.out.println("Book found by Name : "+authorName);
					
					bookName1 = books[i].getBookName();
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Book not found");
		}
		return bookName1;
	}
	
		public String getPublisherNameByBookName(String bookName)
	{
		boolean f=false;
		String publiser = null;
		System.out.println("Inside Get publisher name  by book name method");
		if(bookName != null)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getBookName().equals(bookName))
				{
					System.out.println("publiser name  found by using book name : "+bookName);
					
					publiser = books[i].getPublisher();
					
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Book not found");
		}
		return publiser;
	}
	
	public String getAuthorNameByPriece(int priece)
	{
		boolean f=false;
		String author1= null;
		System.out.println("Inside Get publisher name  by book name method");
		if(priece != 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getPriece()==(priece))
				{
					System.out.println("Author name  found by using priece : "+priece);
					
					author1 = books[i].getAuthorName();
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Book not found");
		}
		return author1;
	}
	
	public int getEditionByPubliser(String publiser)
	{
		boolean f=false;
		int edition1= 0;
	
		if(publiser!= null)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getPublisher().equals(publiser))
				{
					System.out.println("Book edition  found by using publiser : "+publiser);
					
					edition1 = books[i].getEdition();
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}	
		}
		if(f==false)
		{
			System.out.println("Book not found");
		}
		return edition1;
		
	}
	
	public void updateAuthorNameUsingBookId(int bookId, String authorName){
		
		boolean f = false;
		BookDTO booksDTO = null;
		
		
		System.out.println("inside the updateAuthorNameUsingBookId method");
		
		int i =0;
		
		if(books[i]!=null && authorName !=null)
		{
			for(i=0; i<books.length; i++)
			{
				if(books[i].getBookId()==bookId)
				{
					System.out.println("updating the author name  using the book id and the new author is  :" +authorName);
					
					books[i].setAuthorName(authorName);
					
					f=true;
				}
			}
		}
		
			if(f==false)
			{
				System.out.println("book author is not updating");
			}
		
	}
}