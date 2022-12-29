package lendingManagement;

import java.time.LocalDate;

public class Lending {
	
	int id;
	LocalDate lendinDate;
	LocalDate returnDate;
	int bookId;
	int readerId;
	
	
	public Lending( int bookId, int readerId) {
		super();
		
		this.bookId = bookId;
		this.readerId = readerId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getLendinDate() {
		return lendinDate;
	}


	public void setLendinDate(LocalDate lendinDate) {
		this.lendinDate = lendinDate;
	}


	public LocalDate getReturnDate() {
		return returnDate;
	}


	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public int getReaderId() {
		return readerId;
	}


	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}


	@Override
	public String toString() {
		return "Lending [id=" + id + ", lendinDate=" + lendinDate + ", returnDate=" + returnDate + ", bookId=" + bookId
				+ ", readerId=" + readerId + "]";
	}
	
	

}
