package readerManagement;

import java.util.List;

import bookManagement.Author;
import persistent.Persistent;

public  class ReaderManagerImpl implements ReaderManager {
	
	public void createReader (String firstName, String lastName) {
		Reader reader = new Reader(firstName, lastName);
		Persistent.getInstance().persist(reader);
	}
	
	public Reader getReader(int id) {
		return Persistent.getInstance().getReader(id);
	}
	
	public List<Reader> searchReader(String search){
		return Persistent.getInstance().searchReaders(search);
	}
	
	

}
