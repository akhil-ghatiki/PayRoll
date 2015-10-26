package Payroll;

public class CommissionEmployee extends Employee{
	int numberOfSales;
	double earnings;
	
	public int getNumberOfSales() {
		return numberOfSales;
	}
	public CommissionEmployee(String firstName, String lastName, String ssn,
			int numberOfSales) {
		super(firstName, lastName, ssn);
		this.numberOfSales = numberOfSales;
		//this.earnings = earnings;
	}
	public void setNumberOfSales(int numberOfSales) {
		this.numberOfSales = numberOfSales;
	}
	
	public double earnings()
	{
		if(numberOfSales>50 && numberOfSales<200)
		{
			earnings = numberOfSales * 50;
		}
		else if(numberOfSales>200 && numberOfSales<500)
		{
			earnings = numberOfSales * 75;
		}
		else if(numberOfSales>500)
		{
			earnings = numberOfSales * 100;
		}
		else
		{
			earnings = numberOfSales;
		}
		System.out.println(earnings);
		return earnings;
		
	}
	public boolean equals(Object obj) {
		if ( obj instanceof CommissionEmployee ) {
			CommissionEmployee otherEmployee = (CommissionEmployee)obj;
			return super.equals(obj) && this.numberOfSales == otherEmployee.numberOfSales;
			
		} else {
			return false;
		}
	}
	
	

}






/*Create a Concrete class CommissionEmployee which extends Employee and adds properties
numberOfSales and commissionPerSale. Provide implementation for earnings method to 
calculate the earnings based on number of Sales and the commisison for sale
*/