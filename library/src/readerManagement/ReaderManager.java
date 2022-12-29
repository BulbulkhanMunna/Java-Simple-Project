package readerManagement;

import java.util.List;

public interface ReaderManager {
	
	public void createReader (String firstName, String lastName);
	public Reader getReader(int id);
	public List<Reader> searchReader(String search);
	

}
