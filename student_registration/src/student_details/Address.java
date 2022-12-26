package student_details;

public class Address {
	
	private String house_No;
	private String road_No;
	private String city;
	private String zipCode;
	private String phoneNumber;
	private String email_Address;
	
	
	public Address(String house_No, String road_No, String city, String zipCode, String phoneNumber,
			String email_Address) {
		super();
		this.house_No = house_No;
		this.road_No = road_No;
		this.city = city;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email_Address = email_Address;
	}


	public String getHouse_No() {
		return house_No;
	}


	public void setHouse_No(String house_No) {
		this.house_No = house_No;
	}


	public String getRoad_No() {
		return road_No;
	}


	public void setRoad_No(String road_No) {
		this.road_No = road_No;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail_Address() {
		return email_Address;
	}


	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}


	@Override
	public String toString() {
		return "Address [house_No=" + house_No + ", road_No=" + road_No + ", city=" + city + ", zipCode=" + zipCode
				+ ", phoneNumber=" + phoneNumber + ", email_Address=" + email_Address + "]";
	}
	
	
	
	
}
