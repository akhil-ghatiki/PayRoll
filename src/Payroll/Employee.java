package Payroll;

import java.util.List;

/*public abstract class Employee {
	String FirstName;
	String LastName;
	private String ssn;
	
	abstract void earnings();


}*/



public abstract class Employee {
	private String firstName;
	private String lastName;
	private String ssn;
	public List<Dependent> dep;
	
	public List<Dependent> getDep() {
		return dep;
	}

	public void setDep(List<Dependent> dep) {
		this.dep = dep;
	}

	public Employee(String firstName, String lastName, String ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public abstract double earnings();

	public boolean equals(Object obj) {
		if ( obj instanceof Employee ) {
			Employee otherEmployee = (Employee)obj;
			return this.firstName.equals(otherEmployee.firstName) 
					&& this.lastName.equals(otherEmployee.lastName)
					&& this.ssn.equals(otherEmployee.ssn);
		} else {
			return false;
		}
	}

	public String toString() {
		return this.firstName + " " + this.lastName+ " "+this.getDep();
	}
	
	
}
