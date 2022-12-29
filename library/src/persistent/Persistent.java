package persistent;

import java.util.ArrayList;
import java.util.List;

import bookManagement.Author;
import bookManagement.Book;
import lendingManagement.Lending;
import readerManagement.Reader;

public class Persistent {
	
	private static Persistent instance;
	private static int nextID = 1;
	private static int nextBookId = 1;
	private static int nextReaderId = 1;
	private static int nextLendingId = 1;
	
	private Persistent () {
		
	}
	
	public static Persistent getInstance() {
		if (instance == null) {
			instance = new Persistent();
			
		}
		return instance;
		
	}
	
	List<Author>authors = new ArrayList<>();
	
	public void persist(Author author) {
		author.setId(nextID);
		nextID++;
		authors.add(author);
		
	}
	
	public List<Author>searchAuthors(String search){
		List<Author>foundAuthors = new ArrayList<>();
		for (int i = 0; i < authors.size(); i++) {
			if (search.equals(authors.get(i).getLastName())) {
				foundAuthors.add(authors.get(i));
				
			}
			
		}
		return foundAuthors;
	}
	
	
	public List<Author>allAuthors(){
		return authors;
	}
	
	List<Book> books = new ArrayList<>();
	
	public void persist(Book book) {
		book.setId(nextBookId);
		nextBookId++;
		books.add(book);
	}
	
	public Book getBook(int id) {
		Book foundBook = new Book();
		
		for (int i = 0; i < books.size(); i++) {
			if (id == books.get(i).getId()) {
				foundBook = books.get(i);
				break;
				
			}
			
		}
		return foundBook;
	}
	
	public List<Book> searchBooks(String title){
		List<Book> founBooks = new ArrayList<>();
		for (int i = 0; i < books.size(); i++) {
			if (title.equals(books.get(i).getTitle())) {
				founBooks.add(books.get(i));
				
			}
			
		}
		return founBooks;
	}
	
	public List<Book> allBooks(){
		return books;
	}
	
	List<Reader> readers = new ArrayList<>();
	
	public void persist (Reader reader) {
		reader.setId(nextReaderId);
		nextReaderId++;
		readers.add(reader);
	}
	
	public Reader getReader(int id){

        Reader foundReader = new Reader();

        for(int i=0; i<readers.size(); i++){
            if(id == readers.get(i).getId()){
                foundReader = readers.get(i);
                break;
            }
        }

        return foundReader;
    }
	
	
	public List<Reader>searchReaders(String search){
		List<Reader>fouReaders = new ArrayList<>();
		for (int i = 0; i < readers.size(); i++) {
			if (search.equals(readers.get(i).getLastName())) {
				fouReaders.add(readers.get(i));
				
			}
			
		}
		return fouReaders;
	}
	
	public List<Reader> allReaders(){
		return readers;
	}
	
	
	List<Lending>lendings = new ArrayList<>();
	
	 public void persist(Lending lending) {
		 lending.setId(nextLendingId);
		 nextLendingId++;
		 lendings.add(lending);
	 }
	 
	 public void returnBook(int bookId) {
	
		 
		 for (int i = 0; i < lendings.size(); i++) {
			 if (bookId == lendings.get(i).getBookId()) {
				 lendings.remove(i);
				 break;
				
			}
			
		}
	 }
	 
	 public List<Lending>allLendings(){
		 return lendings;
	 }
	

}























