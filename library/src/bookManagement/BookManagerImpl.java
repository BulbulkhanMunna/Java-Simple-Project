package bookManagement;

import java.util.List;

import persistent.Persistent;

public  class BookManagerImpl implements BookManager {
	
	public void createAuthor (String firstName, String lastName){
		Author author = new Author(firstName, lastName);
		Persistent.getInstance().persist(author);
		
	}
	
     
	public List<Author>searchAuthor(String lastName){
		return Persistent.getInstance().searchAuthors(lastName);
	}
	
	public void createBook(String title,List<Author>authors) {
		Book book = new Book(title);
		book.setAuthors(authors);
		Persistent.getInstance().persist(book);
	}
	
	
	public Book getBook(int id) {
		return Persistent.getInstance().getBook(id);
	}
	
	public List<Book> searchBook(String title){
		return Persistent.getInstance().searchBooks(title);
	}
	
	

}
