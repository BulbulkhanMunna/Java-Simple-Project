package student_details;

public class Course {
	
	private String course_name;
	private String course_code;
	private double course_credit;
	
	public Course(String course_name, String course_code, double course_credit) {
		super();
		this.course_name = course_name;
		this.course_code = course_code;
		this.course_credit = course_credit;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}


	public double getCourse_credit() {
		return course_credit;
	}

	public void setCourse_credit(double course_credit) {
		this.course_credit = course_credit;
	}

	@Override
	public String toString() {
		return "Course [course_name=" + course_name + ", course_code=" + course_code + ", course_credit="
				+ course_credit + "]";
	}
	
	
	
	
	

}
