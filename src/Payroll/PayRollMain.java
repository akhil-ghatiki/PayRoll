package Payroll;

import java.util.ArrayList;
import java.util.List;

public class PayRollMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee se = new SalariedEmployee("akhil","ghatiki","asd123",12345.3265);
		SalariedEmployee se1 = new SalariedEmployee("akhil","ghatiki","asd123",12345.3265);
		HourlyEmployee he = new HourlyEmployee("akhil","ghatiki","asd123",12345.3265,4);
		CommissionEmployee ce = new CommissionEmployee("akhil","ghatiki","asd123",56);
		BasePlusCommissionEmployee be = new BasePlusCommissionEmployee("akhil","ghatiki","asd123",56,4000);
		Dependent d = new Dependent("Abdul Kalam", "President", 84);
		Dependent d1 = new Dependent("Modi","PrimeMInister",65);              // Exercise-8 collections
		List<Dependent> ld = new ArrayList<Dependent>();
		ld.add(d);
		ld.add(d1);   // exercise-8 collections 
		
		se.setDep(ld); // exercise-8 collections
		
		System.out.println(se.toString());
		boolean b =se.equals(se1);
		//se.setWeeklysalary(5000);
		se.earnings();
		//he.setHours(8);
		//he.setWage(500);
		he.earnings();
		//ce.setNumberOfSales(600);
		ce.earnings();
		be.setBaseSalary(9000);
		be.earnings();
		System.out.println(b);

	}

}



/*String firstName, String lastName,
String ssn, int numberOfSales, double earnings, double baseSalary,
double totalSalary*/