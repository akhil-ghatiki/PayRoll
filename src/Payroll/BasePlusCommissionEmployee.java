package Payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	double baseSalary;
	double totalSalary=0;
	public BasePlusCommissionEmployee(String firstName, String lastName,
			String ssn, int numberOfSales,double baseSalary) {
		super(firstName, lastName, ssn, numberOfSales);
		this.baseSalary = baseSalary;
	}
	public double earnings()
	{
		totalSalary = baseSalary+super.earnings();
		System.out.println(totalSalary);
		return totalSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public boolean equals(Object obj) {
		if ( obj instanceof BasePlusCommissionEmployee ) {
			BasePlusCommissionEmployee otherEmployee = (BasePlusCommissionEmployee)obj;
			return super.equals(obj) && this.baseSalary == otherEmployee.baseSalary;
			
		} else {
			return false;
		}
	}
}




/*Create a Concrete class BasePlusCommissionEmployee which extends CommissionEmployee
with additional property baseSalary. Provide implementation for earnings method to 
calculate the earnings. His total earnings are comission added to the base Salary.

*/