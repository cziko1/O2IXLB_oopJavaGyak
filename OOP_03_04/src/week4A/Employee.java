package week4A;

public class Employee {
	private String name;
	private int Salary;
	
	public void SalaryGrowing(int value) {
		this.Salary += value;
	}
	public String getDatas() {
		return "name: "+this.name+"Salary: "+this.Salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public String setName() {
		return this.name;
	}
	public  int getSalary() {
		return this.Salary;
	}
}
