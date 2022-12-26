package student_details;

import java.util.ArrayList;
import java.util.Scanner;

public class Start_Point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Student Registration");
		System.out.println("--------------------");
		
		System.out.print("Enter Name : ");
		String studentName = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter ID : ");
		String studentID = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Age : ");
		int studentAge = scanner.nextInt();
		System.out.println();
		
		System.out.print("Enter Department Name : ");
		scanner.next();
		String DepartmentName = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Department Building : ");
		String DepartmentBuuilding = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter House Number : ");
		String HouseNumber = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Road Number : ");
		String RoadNumber = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter City : ");
		String City = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Zipcode : ");
		String ZipCode = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Phone Number : ");
		String PhoneNumber = scanner.nextLine();
		System.out.println();
		
		System.out.print("Enter Email Address : ");
		String Email = scanner.nextLine();
		System.out.println();
		
		System.out.println("Course Registration");
		System.out.println("-------------------");
		System.out.println("How many courses ?");
		int count = scanner.nextInt();
		
		ArrayList<Course>courses = new ArrayList<Course>();
		
		
		for (int a = 0; a < count; a++) {
			
			System.out.print("Enter Course Name : ");
			scanner.next();
			String courseName = scanner.nextLine();
			System.out.println();
			
			System.out.print("Enter Course Code : ");
			String courseCode = scanner.nextLine();
			System.out.println();
			
			System.out.print("Enter Course Credit : ");
			double courseCredit = scanner.nextDouble();
			
			Course c = new Course(courseName, courseCode, courseCredit);
			courses.add(c);
			
			
		}
		
		Department d1 = new Department(DepartmentName, DepartmentBuuilding);
		Address    a1 = new Address(HouseNumber, RoadNumber, City, ZipCode, PhoneNumber, Email);
		Student    s1 = new Student(studentName, studentID, studentAge, d1, a1, courses);
		
		System.out.println(s1);
		
		
		
		/*Department d1 = new Department("Computer Science", "A");
		Address    a1 = new Address("101", "10", "Dhaka", "1215", "0199245", "earnmunna@");
        Course     c1 = new Course("Java", "cs-101", "3.0");
        Course     c2 = new Course("AI", "cs-102", "3.0");
        
        
        ArrayList<Course> courses1 = new ArrayList<Course>(); 
        courses1.add(c1);
        courses1.add(c2);
        
        Student s1 = new Student("Munna", "004", 20, d1, a1, courses1);
        
        
       // System.out.println(s1);
        
       /*Department
        System.out.println(s1.getDepartment());
        
        //Courses name
        for(Course c : s1.getCourses()) {
        	System.out.println(c.getCourse_name());
        }*/
        
	}

}
