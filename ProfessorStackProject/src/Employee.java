
public class Employee extends Person {
	//instance variables
	private int employeeID;
	
	//default constructor
	public Employee() {
		super();
		employeeID = 0;
	}
	
	public void setEmployeeId(int employeeId) {
		if(employeeId > 0) {
			this.employeeID = employeeId;
		}
	}
	
	public int getEmployeeId() {
		return employeeID;
	}
	
	public String toString() {
		return super.toString() + " Employee ID: " + employeeID;
	}
	
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if(otherObject != null && otherObject instanceof Employee) {
			Employee otherEmployee = (Employee)otherObject;
			if(super.equals(otherEmployee) && this.employeeID == otherEmployee.employeeID) {
				isEqual = true;
			}
		}
		
		return isEqual;
	}
	
}