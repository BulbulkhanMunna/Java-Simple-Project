package bookManagement;


import java.util.List;

public interface BookManager {
	
	void createAuthor (String firstName, String lastName);
	List<Author>searchAuthor(String lastName);
	
	void createBook(String title,List<Author>authors);
	Book getBook(int id);
	List<Book>searchBook(String title);
	

}
