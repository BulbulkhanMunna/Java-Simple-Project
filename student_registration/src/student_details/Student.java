package student_details;

import java.util.ArrayList;

public class Student {
	
	private String studentName;
	private String studentId;
	private int student_Age;
	private Department department;
	private Address address;
	private ArrayList<Course> courses;
	
	
	public Student(String studentName, String studentId, int student_Age, Department department, Address address,
			ArrayList<Course> courses) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.student_Age = student_Age;
		this.department = department;
		this.address = address;
		this.courses = courses;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public int getStudent_Age() {
		return student_Age;
	}


	public void setStudent_Age(int student_Age) {
		this.student_Age = student_Age;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public ArrayList<Course> getCourses() {
		return courses;
	}


	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", student_Age=" + student_Age
				+ ", department=" + department + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
	

}
