package student_details;

public class Department {
	
	private String dep_name;
	private String dep_building;
	
	
	public Department(String dep_name, String dep_building) {
		super();
		this.dep_name = dep_name;
		this.dep_building = dep_building;
	}
	

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getDep_building() {
		return dep_building;
	}

	public void setDep_building(String dep_building) {
		this.dep_building = dep_building;
	}


	@Override
	public String toString() {
		return "Department [dep_name=" + dep_name + ", dep_building=" + dep_building + "]";
	}
	
	
	

}
