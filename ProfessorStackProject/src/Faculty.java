
public class Faculty extends Employee {
	//instance variables
	private String department;
	
	//default constructor
	public Faculty() {
		super();
		department = "";
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return super.toString() + " Department: " + department;
	}
	
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if(otherObject != null && otherObject instanceof Faculty) {
			Faculty otherFaculty = (Faculty)otherObject;
			if(super.equals(otherFaculty) && this.department.equals(otherFaculty.department)) {
				isEqual = true;
			}
		}
		
		return isEqual;
	}
}
