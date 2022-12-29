package bookManagement;

import java.util.ArrayList;
import java.util.List;

import lendingManagement.LendingManagerImpl;
import persistent.Persistent;
import readerManagement.ReaderManager;
import readerManagement.ReaderManagerImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookManagerImpl bookManager = new BookManagerImpl();
		bookManager.createAuthor("Peter", "kofi");
		bookManager.createAuthor("Anokey", "kennedy");
		bookManager.createAuthor("Mahili", "Ismayil");
		
		System.out.println(Persistent.getInstance().allAuthors());
		
		System.out.println(bookManager.searchAuthor("kennedy"));
		
		System.out.println();
		
		
		
		//Book
		List<Author> authors1 = new ArrayList<>();
		authors1.add(new Author("Peter", "kofi"));
		bookManager.createBook("Spring Boot", authors1);
		
		
		List<Author> authors2 = new ArrayList<>();
		authors2.add(new Author("Anokye", "kenndy"));
		bookManager.createBook("War and Piece", authors2);
		
		List<Author> authors3 = new ArrayList<>();
		authors3.add(new Author("Anokye", "kenndy"));
		bookManager.createBook("Java", authors3);
		
		
		System.out.println(Persistent.getInstance().allBooks());
		
		System.out.println(Persistent.getInstance().getBook(2));
		
		System.out.println(bookManager.searchBook("Java"));
		
		System.out.println();
		
		
		
		//Reader
		
		ReaderManagerImpl readerManager = new ReaderManagerImpl();
		readerManager.createReader("Simon", "Kofi");
		readerManager.createReader("Patel", "Prital");
		readerManager.createReader("Linder", "Jonas");
		
		System.out.println(Persistent.getInstance().allReaders());
		
		System.out.println(readerManager.getReader(2));
		
		System.out.println(readerManager.searchReader("Jonas"));
		
		System.out.println();
		
		
		//Lending
		
		LendingManagerImpl lendingManager = new LendingManagerImpl();
		lendingManager.lendBook(1, 1);
		lendingManager.lendBook(2, 2);
		lendingManager.lendBook(3, 3);
		
		System.out.println(lendingManager.getAllLendings());
		lendingManager.returnBook(1);
		System.out.println(lendingManager.getAllLendings());
		
		System.out.println();
		


	}

}
