
public class Person {
	//instance variables
	private String name;
	
	//default constructor
	public Person() {
		super();
		name = "";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Name: " + name;
	}
	
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if(otherObject != null && otherObject instanceof Person) {
			Person otherPerson = (Person)otherObject;
			if(this.name.equals(otherPerson.name)) {
				isEqual = true;
			}
		}
		
		return isEqual;
	}
}
