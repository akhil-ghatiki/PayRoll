package com.data;

public class SalariedEmployee extends Employee {
	
	private static final double MINIMUM_WEEKLY_WAGE = 4000;
	private double weeklySalary; 

	public SalariedEmployee(String firstName, String lastName, 
			String ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.setWeeklySalary(weeklySalary);
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if ( weeklySalary < MINIMUM_WEEKLY_WAGE ) {
			this.weeklySalary = MINIMUM_WEEKLY_WAGE;
		}
		this.weeklySalary = weeklySalary;
	}

	public double earnings() {
		return 4 * weeklySalary;
	}

	public boolean equals(Object obj) {
		if ( obj instanceof SalariedEmployee ) {
			SalariedEmployee otherEmployee = (SalariedEmployee)obj;
			return super.equals(obj) && this.weeklySalary == otherEmployee.weeklySalary;
			
		} else {
			return false;
		}
	}

	public String toString() {
		return super.toString() + "Weekly Salary is, "+this.weeklySalary;
	}
	
	
}
