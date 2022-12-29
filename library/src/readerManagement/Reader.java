package readerManagement;

public class Reader {
	
	int id;
	String firstName;
	String lastName;
	
	
	
	public Reader(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

	public Reader() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Reader [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	

}
