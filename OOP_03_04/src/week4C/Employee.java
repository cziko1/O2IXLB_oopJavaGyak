package week4C;

public class Employee {
	private String name ;
	private int Salary;
	
	public void SalarayGrowing(int value) {
		this.Salary += value;
	}
	public String getData(){
		return "Name: "+name+"Salary: "+Salary;
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
	public boolean getSalaryLimit(int Lower, int Higher) {
		if(this.Salary <= Lower && this.Salary >= Higher) {
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
