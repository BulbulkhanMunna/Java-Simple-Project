package lendingManagement;


import java.util.List;

import persistent.Persistent;

public   class LendingManagerImpl implements LendingManager{
	
	public void lendBook(int bookId, int readerId) {
		
		Lending lending = new Lending(bookId, readerId);
		Persistent.getInstance().persist(lending);
		
	}
	
	public void returnBook(int bookId) {
		 Persistent.getInstance().returnBook(bookId);
	 }
	
	

	@Override
	public List<Lending> getAllLendings() {
		// TODO Auto-generated method stub
		return Persistent.getInstance().allLendings();
	}

	
		
	

}
