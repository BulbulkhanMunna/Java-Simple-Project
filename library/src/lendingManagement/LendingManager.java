package lendingManagement;

import java.util.List;

public interface LendingManager {
	
	void lendBook(int bookId, int readerId);
	void returnBook (int bookId);
	List<Lending>getAllLendings();

}
