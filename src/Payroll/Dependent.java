package Payroll;

public class Dependent{

	public String DependentName;
	public String relation;
	public int age;
	public Dependent(String dependentName, String relation, int age) {
		super();
		DependentName = dependentName;
		this.relation = relation;
		this.age = age;
	}
	/*public String getDependentName() {
		return DependentName;
	}
	public void setDependentName(String dependentName) {
		DependentName = dependentName;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.DependentName;
	}
	
}
