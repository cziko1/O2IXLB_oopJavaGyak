package week4B;

public class Employee {
	private String name;
	private int Salary;
	
	public void SalaryGrowing(int value) {
		this.Salary += value;
	}
	public String getDatas() {
		return "Name: "+this.name+"Salary: "+this.Salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public String getName() {
		return this.name;
	}
	public int getSalary() {
		return this.Salary;
	}
	public boolean getSalaryLimit(int Higher, int Lower) {
		if(this.Salary <= Higher && this.Salary <= Lower) {
			return true;
		}
		
		return false;
	}
	public double getTax() {
		return this.Salary * 0.16;
	}
	public boolean getEmpSalaryBiggerThan(Employee Emp) {
		if(this.Salary > Emp.Salary) {
			return true;
		}	
		return false;
	}

}
